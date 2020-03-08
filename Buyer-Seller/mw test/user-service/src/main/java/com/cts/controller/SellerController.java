package com.cts.controller;

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

import com.cts.entities.Seller;
import com.cts.service.SellerService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(value = "/seller")
public class SellerController {

	@Autowired
	SellerService service;

	@RequestMapping(method = RequestMethod.POST, value = "/sign")
	void addBuyer(@RequestBody Seller seller) {
		seller.setRole("SELLER");
		seller.setUserName(seller.getEmailId());
		service.addSeller(seller);
	}
	@GetMapping
	List<Seller> getAllRegistrations() {
		return service.getAllSellers();
	}
	@RequestMapping("/seller/{id}")
	Optional<Seller> getSellerDetailsByID(@PathVariable int id) {
		return service.getSellerDetailsByID(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/sel")
	void updateSeller(@RequestBody Seller seller) {
		service.updateSeller(seller);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/seller/{id}")
	void deleteSeller(@PathVariable int id) {
		service.deleteSeller(id);
	}
	
	
	@RequestMapping("/sellers/username/{username}")
	Seller getSellerByFirstName(@PathVariable String firstName)
	{
		return service.getSellerByFirstName(firstName);
	}

}
