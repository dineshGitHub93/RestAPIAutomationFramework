package com.api.models.request;

public class ForgotPasswordRequest {
	
	private String email;

	public ForgotPasswordRequest(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ForgotPasswordRequest [email=" + email + "]";
	}
	
	public static class Builder{
		
		private String email;
		
		public Builder email(String email) {
			this.email = email;
			return this;		
		}
		
		public ForgotPasswordRequest build() {
			ForgotPasswordRequest forgetPassword = new ForgotPasswordRequest(email);
			return forgetPassword;
		}
	}

}
