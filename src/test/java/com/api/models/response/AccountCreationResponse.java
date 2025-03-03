package com.api.models.response;

public class AccountCreationResponse {
	
	private String accountNumber; 
	private String  accountType; 
	private int  balance; 
	private String  status; 
	private String  branch; 
	private String  createdAt; 
	private String  ownerName;
	
	public AccountCreationResponse() {
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "AccountCreationResponse [accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance="
				+ balance + ", status=" + status + ", branch=" + branch + ", createdAt=" + createdAt + ", ownerName="
				+ ownerName + "]";
	}

}
