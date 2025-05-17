package com.Banking.BankingApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.Banking.BankingApplication.model.Bank;
import com.Banking.BankingApplication.service.BankService;

@Controller
public class BankController {

	private BankService bankService;

	public BankController(BankService bankService) {
		super();
		this.bankService = bankService;
	}

	@GetMapping("/customers")
	public String listCustomers(Model model) {
		model.addAttribute("customers", bankService.getAllcustomers());
		return "customers";
	}

	@GetMapping("/customers/new")
	public String createCustomerForm(Model model) {

		// create student object to hold student form data
		Bank customer = new Bank();
		model.addAttribute("customer", customer);
		return "create_customer";

	}

	@PostMapping("/customers")
	public String saveCustomer(@ModelAttribute("customer") Bank customer) {
		bankService.saveCustomer(customer);
		return "redirect:/customers";
	}

	@GetMapping("/customers/edit/{accountNumber}")
	public String editCustomerForm(@PathVariable Long accountNumber, Model model) {
		model.addAttribute("customer", bankService.getCustomerById(accountNumber));
		return "edit_customer";
	}

	@PostMapping("/customers/{accountNumber}")
	public String updateCustomer(@PathVariable Long accountNumber,
			@ModelAttribute("customer") Bank customer,
			Model model) {

		// get student from database by id
		Bank existingCustomer = bankService.getCustomerById(accountNumber);
		existingCustomer.setAccountNumber(accountNumber);
		existingCustomer.setName(customer.getName());
		existingCustomer.setMobileno(customer.getMobileno());
		existingCustomer.setAddress(customer.getAddress());

		// save updated student object
		bankService.updateCustomer(existingCustomer);
		return "redirect:/customers";
	}

	// handler method to handle delete student request

	@GetMapping("/customers/{accountNumber}")
	public String deleteCustomer(@PathVariable Long accountNumber) {
		bankService.deleteCustomerById(accountNumber);
		return "redirect:/customers";
	}

}
