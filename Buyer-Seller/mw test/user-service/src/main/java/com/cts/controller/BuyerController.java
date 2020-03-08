package com.cts.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entities.Buyer;
import com.cts.service.BuyerService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(value = "/buyer")
public class BuyerController {

	@Autowired
	BuyerService service;

	@RequestMapping(method = RequestMethod.POST, value = "/signup")
	void addBuyer(@RequestBody Buyer buyer) {
		buyer.setCreatedDate(new Date().toString());
		buyer.setRole("BUYER");
		buyer.setUserName(buyer.getEmailId());
		service.addBuyer(buyer);
	}
	@GetMapping
	List<Buyer> getAllRegistrations() {
		return service.getAllBuyers();
	}
	
	@RequestMapping("/buyer/{id}")
	Optional<Buyer> getBuyerDetailsByID(@PathVariable int id) {
		return service.getBuyerDetailsByID(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/buy/")
	void updateBuyer(@RequestBody Buyer buyer) {
		service.updateBuyer(buyer);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/buyer/{id}")
	void deleteBuyer(@PathVariable int id) {
		service.deleteBuyer(id);
	}
	
	@RequestMapping("/buyers/username/{username}")
	Buyer getUserByFirstName(@PathVariable String firstName)
	{
		return service.getBuyerByFirstName(firstName);
	}

}
