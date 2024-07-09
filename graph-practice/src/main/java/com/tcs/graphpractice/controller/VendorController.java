package com.tcs.graphpractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.tcs.graphpractice.entity.Vendor;
import com.tcs.graphpractice.repository.VendorRepository;

@Controller
public class VendorController {
	
	@Autowired
	public VendorRepository vendorRepository;
	
	@QueryMapping
	public List<Vendor> getVendors(){
		
		List<Vendor> v1 = vendorRepository.findAll();
		
		return v1;
	}
	
	@QueryMapping
	public String getFirstMsg() {
		
		return "Hello bro";
	}
	

}
