package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountCreationEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String userAddress;
	private String aadharNo;
	private String contact;
	private String accountStatus;
	private int accountNumber;
	private int depositeAmt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getDepositeAmt() {
		return depositeAmt;
	}
	public void setDepositeAmt(int depositeAmt) {
		this.depositeAmt = depositeAmt;
	}
	@Override
	public String toString() {
		return "AccountCreationEntity [id=" + id + ", userName=" + userName + ", userAddress=" + userAddress
				+ ", aadharNo=" + aadharNo + ", contact=" + contact + ", accountStatus=" + accountStatus
				+ ", accountNumber=" + accountNumber + ", depositeAmt=" + depositeAmt + "]";
	}
	
	
	
	
}
