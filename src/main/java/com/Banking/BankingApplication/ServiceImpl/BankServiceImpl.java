package com.Banking.BankingApplication.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Banking.BankingApplication.model.Bank;
import com.Banking.BankingApplication.service.BankService;
import com.Banking.BankingApplication.Repository.BankRepository;

@Service
public class BankServiceImpl implements BankService {
	
	private BankRepository  bankRepository;

	public BankServiceImpl(BankRepository bankRepository) {
		super();
		this.bankRepository = bankRepository;
	}
	
	@Override
	public List<Bank> getAllcustomers(){
		return bankRepository.findAll();
	}

	@Override
	public Bank saveCustomer(Bank customer) {
		// TODO Auto-generated method stub
		return bankRepository.save(customer);
	}

	@Override
	public Bank getCustomerById(Long accountNumber) {
		// TODO Auto-generated method stub
		return bankRepository.findById(accountNumber).get();
	}

	@Override
	public Bank updateCustomer(Bank customer) {
		// TODO Auto-generated method stub
		return bankRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(Long accountNumber) {
		// TODO Auto-generated method stub
		bankRepository.deleteById(accountNumber);
		
	}
	
	
	

}
