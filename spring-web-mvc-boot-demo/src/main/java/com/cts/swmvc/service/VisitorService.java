package com.cts.swmvc.service;

import com.cts.swmvc.exception.InvalidVisitorException;
import com.cts.swmvc.model.Visitor;

public interface VisitorService {
	boolean isValid(Visitor visitor) throws InvalidVisitorException;
	Visitor computeAge(Visitor visitor);
}
