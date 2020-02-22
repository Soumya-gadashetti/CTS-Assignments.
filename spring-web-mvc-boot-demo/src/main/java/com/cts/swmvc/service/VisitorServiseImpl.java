package com.cts.swmvc.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

import com.cts.swmvc.exception.InvalidVisitorException;
import com.cts.swmvc.model.Visitor;
@Service
public class VisitorServiseImpl implements VisitorService {
	
	public Visitor computeAge(Visitor visitor) {
		if(visitor!=null) {
			LocalDate today=LocalDate.now();
			int age=Period.between(visitor.getDateOfBirth(),today).getYears();
			visitor.setAge(age);
		}
		return visitor;
	}

	@Override
	public boolean isValid(Visitor visitor) throws InvalidVisitorException {
		// TODO Auto-generated method stub
		boolean isOk=true;
		if(LocalDate.now().isBefore(visitor.getDateOfBirth())) {
			isOk=false;
			throw new InvalidVisitorException("INvalid Date of Birth");
		}
		return isOk;
	}

}
