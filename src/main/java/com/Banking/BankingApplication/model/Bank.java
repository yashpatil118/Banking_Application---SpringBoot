package com.Banking.BankingApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "banks")
public class Bank {
      
	  @Id
	  private Long accountNumber;
	  
	  @Column(name = "account_name")
	  private String name;
	  
	  @Column(name = "mobile_no")
	  private String mobileno;
	  
	  @Column(name = "address")
	  private String address;
	  
	  public Bank() {
		  
	  }
	
	public Bank(Long accountNumber, String name, String mobileno, String address) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.mobileno = mobileno;
		this.address = address;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	  
	  
}
