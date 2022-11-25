package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Account;
import com.nt.entity.AccountPrimaryKey;

public interface AccountRepository extends JpaRepository<Account, AccountPrimaryKey>{

}
