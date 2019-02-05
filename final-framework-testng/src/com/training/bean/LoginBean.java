package com.training.bean;

public class LoginBean {
	/*private String userName;
	private String password;*/
	
	private String yourName;
	private String email;
	private String subject;
	private String message;
	
	public LoginBean() {
	}
	

	public String getYourName() {
		return yourName;
	}


	public void setYourName(String yourName) {
		this.yourName = yourName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "LoginBean [yourName=" + yourName + ", email=" + email + ",subject=" + subject + ", message=" + subject + "]";
	}


	
	
/*
	public LoginBean(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}
	*/
	
	
}
