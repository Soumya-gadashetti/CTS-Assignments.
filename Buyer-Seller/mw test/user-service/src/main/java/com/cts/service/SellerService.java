package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entities.Seller;
import com.cts.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	SellerRepository repo;

	public void addSeller(Seller seller) {
		repo.save(seller);
		
	}

	public List<Seller> getAllSellers() {
		
			return (List<Seller>)repo.findAll();
		}
	
	public void updateSeller(Seller seller) {
		repo.save(seller);

	}
	
	public void deleteSeller(int id) {
		repo.deleteById(id);

	}
	
	public Seller getSellerByFirstName(String firstName) {

		return repo.findByFirstName(firstName);

	}
	
	public Optional<Seller> getSellerDetailsByID(int id) {
		return repo.findById(id);
	}

}
