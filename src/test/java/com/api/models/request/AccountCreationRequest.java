package com.api.models.request;

public class AccountCreationRequest {


	private String accountType; 
	private String branch;

	public AccountCreationRequest() {
		
	}
	public AccountCreationRequest(String accountType, String branch) {
		super();
		this.accountType = accountType;
		this.branch = branch;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "AccountCreationRequest [accountType=" + accountType + ", branch=" + branch + "]";
	} 

	public static class Builder {

		private String accountType; 
		private String branch;

		public Builder accountType(String accountType) {
			this.accountType = accountType;
			return this;	
		}

		public Builder branch(String branch) {
			this.branch = branch;
			return this;	
		}

		public AccountCreationRequest build() {
			AccountCreationRequest accountCreationRequest = new AccountCreationRequest(accountType, branch);
			return accountCreationRequest;	
		}

	}

}
