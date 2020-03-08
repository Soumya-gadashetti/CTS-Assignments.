package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entities.Buyer;
import com.cts.repository.BuyerRepository;

@Service
public class BuyerService {
	
	@Autowired
	BuyerRepository repo;

	public void addBuyer(Buyer buyer) {
		repo.save(buyer);
		
	}

	public List<Buyer> getAllBuyers() {
		return (List<Buyer>)repo.findAll();
	}
	
	public void updateBuyer(Buyer buyer) {
		repo.save(buyer);
		
	}
	public void deleteBuyer(int id) {
		repo.deleteById(id);
		
	}
	public Buyer getBuyerByFirstName(String firstName) {
		
		return repo.findByFirstName(firstName);
		
	}
	public Optional<Buyer> getBuyerDetailsByID(int id) {
		return repo.findById(id);
	}

}
