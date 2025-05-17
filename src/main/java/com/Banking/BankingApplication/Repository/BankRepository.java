package com.Banking.BankingApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banking.BankingApplication.model.Bank;

public interface BankRepository extends JpaRepository<Bank , Long>{

}
