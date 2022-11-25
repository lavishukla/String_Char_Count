package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AccountPrimaryKey implements Serializable{
	
	private int accID;
	private String accType;
	private String holderName;
	public int getAccID() {
		return accID;
	}
	public void setAccID(int accID) {
		this.accID = accID;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	@Override
	public String toString() {
		return "AccountPrimaryKey [accID=" + accID + ", accType=" + accType + ", holderName=" + holderName + "]";
	}

}
