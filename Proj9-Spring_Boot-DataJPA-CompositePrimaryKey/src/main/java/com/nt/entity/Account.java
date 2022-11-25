package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BANK_ACCOUNTS")
public class Account {

	@Column(name="BRANCH_NAME")
	private String branchName;
	
	@Column(name="MIN_BAL")
	private Double minBal;
	
	@EmbeddedId
	private AccountPrimaryKey accpk;

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + ", accpk=" + accpk + "]";
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getMinBal() {
		return minBal;
	}

	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}

	public AccountPrimaryKey getAccpk() {
		return accpk;
	}

	public void setAccpk(AccountPrimaryKey accpk) {
		this.accpk = accpk;
	}
}
