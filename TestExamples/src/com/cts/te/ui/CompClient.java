package com.cts.te.ui;

import java.util.Set;
import java.util.TreeSet;

import com.cts.te.model.Person;

public class CompClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> persons=new TreeSet<>();
		persons.add(new Person("Soumya",30));
		persons.add(new Person("Meens",33));
		persons.add(new Person("Pushpa",40));
		persons.add(new Person("Srilekha",88));
		persons.add(new Person("Soumya",90));
		
		for(Person person:persons) {
			System.out.println(person);
		}
		
	}

}
