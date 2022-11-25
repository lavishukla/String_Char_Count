package com.nt.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nt.entity.Account;
import com.nt.entity.AccountPrimaryKey;
import com.nt.repository.AccountRepository;

@Service
public class AccountService {

	private AccountRepository accRepo;

	public AccountService(AccountRepository accRepo) {
		this.accRepo = accRepo;
	}
	
	// Insertion
	
	public void getDataUsingPK() {
		AccountPrimaryKey pk = new AccountPrimaryKey();
		
		pk.setAccID(101);
		pk.setAccType("Current");
		pk.setHolderName("Shashank Shukla");
		
		Optional<Account> findById = accRepo.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
	}
	
	// Retrieval
	
	public void saveAccData() {
		AccountPrimaryKey pk = new AccountPrimaryKey();
		pk.setAccID(101);
		pk.setAccType("Saving");
		pk.setHolderName("Lavi Shukla");
	
		Account acc = new Account();
		acc.setBranchName("Ameerpet");
		acc.setMinBal(5000.0);
	
		acc.setAccpk(pk);
		accRepo.save(acc);
	}
}
