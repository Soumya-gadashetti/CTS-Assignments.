package com.cts.bscp.ui;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.cts.bscp.exception.BusStoreException;
import com.cts.bscp.model.Bus;
import com.cts.bscp.model.BusStoreAppMenu;
import com.cts.bscp.service.BusServiceImpl;
import com.cts.bscp.service.IBusService;

public class BusStoreManagementUI {

	private static IBusService busService;
	private static Scanner scan;
	private static DateTimeFormatter dtFormater;

	public static void main(String[] args) {

		try {
			busService = new BusServiceImpl();
		} catch (BusStoreException e) {
			e.printStackTrace();
		}


		scan = new Scanner(System.in);
		dtFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		BusStoreAppMenu menu = null;

		while (menu != BusStoreAppMenu.QUIT) {

			System.out.println("Choice\tMenu Item");
			System.out.println("===========================");
			for (BusStoreAppMenu m : BusStoreAppMenu.values()) {
				System.out.println(m.ordinal() + "\t" + m.name());
			}
			System.out.print("Choice: ");
			int choice = -1;
			if (scan.hasNextInt())
				choice = scan.nextInt();
			else {
				scan.next();
				System.out.println("Pleae choose a choice displayed");
				continue;
			}

			if (choice < 0 || choice >= BusStoreAppMenu.values().length) {
				System.out.println("Invalid Choice");
			} else {
				menu = BusStoreAppMenu.values()[choice];
				switch (menu) {
				case ADD:
					doAdd();
					break;
				case LIST:
					doList();
					break;
				case SEARCH:
					doSearch();
					break;
				case REMOVE:
					doRemove();
					break;
				case QUIT:
					System.out.println("ThanQ Come Again!");
					break;
				}
			}

		}

		scan.close();
		try {
			busService.persist();
		} catch (BusStoreException e) {
			e.printStackTrace();
		}

	}

	private static void doAdd() {
		try {
			Bus Bus = new Bus();
			System.out.print("BCode: ");
			Bus.setBcode(scan.next());
			System.out.print("Title: ");
			Bus.setTitle(scan.next());
			System.out.print("ArrivalDate(dd-MM-yyyy): ");
			String pubDtStr = scan.next();

			try {
				Bus.setArrivalDate(LocalDate.parse(pubDtStr, dtFormater));
			} catch (DateTimeException exp) {
				throw new BusStoreException(
						"Date must be in the format day(dd)-month(MM)-year(yyyy)");
			}
			System.out.print("Price: ");
			if (scan.hasNextDouble())
				Bus.setPrice(scan.nextDouble());
			else {
				scan.next();
				throw new BusStoreException("Price is a number");
			}

			String bcode = busService.add(Bus);
			System.out.println("Bus is Added with code: " + bcode);
		} catch (BusStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doList() {
		List<Bus> buses;
		try {
			buses = busService.getAll();
			if (buses.size() == 0) {
				System.out.println("No buses To display");
			} else {
				for (Bus b : buses)
					System.out.println(b);
			}
		} catch (BusStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doSearch() {
		System.out.print("BCode: ");
		String bcode = scan.next();

		try {
			Bus Bus = busService.get(bcode);
			if (Bus != null) {
				System.out.println(Bus);
			} else {
				System.out.println("No Such Bus");
			}
		} catch (BusStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doRemove() {
		System.out.print("BCode: ");
		String bcode = scan.next();
		try {
			boolean isDone = busService.delete(bcode);
			if (isDone) {
				System.out.println("Bus is Deleted");
			} else {
				System.out.println("No Such Bus");
			}
		} catch (BusStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}
}
