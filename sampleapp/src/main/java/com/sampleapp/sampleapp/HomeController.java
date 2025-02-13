package com.sampleapp.sampleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	ItemDAO itemDAO;
	@RequestMapping("/saveItem")
	public String getHome() {
		return "home";
		
	}
	@PostMapping("/saveItem")
	public String save(Item item) {
		System.out.println(item);
		itemDAO.save(item);
		return "home";
	}
	@Autowired
	BillDao billdao;
	@RequestMapping("/saveBill")
	public String getHome1() {
		return "home1";
		
	}
	@GetMapping("/saveBill")
	public String save(Bill bill) {
		System.out.println(bill);
		billdao.save(bill);
		return "home1";
	}
}