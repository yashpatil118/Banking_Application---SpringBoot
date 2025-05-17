package com.Banking.BankingApplication.service;

import java.util.List;

import com.Banking.BankingApplication.model.Bank;


public interface BankService {
    List<Bank> getAllcustomers();
    
    Bank saveCustomer(Bank customer);
	
	Bank getCustomerById(Long accountNumber);
	
	Bank updateCustomer(Bank customer);
	
	void deleteCustomerById(Long accountNumber); 

}
