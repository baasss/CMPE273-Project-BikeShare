package com.baasss.common.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	
	private String phonenumber;
	
	public String name;
	public String email;
	public String username;
	public String password;
	public String mobileNo;
	public String bikes_owned;
	
	public String getBikes_owned() {
		return bikes_owned;
	}
	public void setBikes_owned(String owned) {
		bikes_owned = owned;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	/*	System.out.println("name n:");
		System.out.println(n);
		System.out.println("name:");
		System.out.println(name);
		System.out.printf("set name::",name);
		System.out.println();
		*/
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String e) {
		
		email = e;
	/*	System.out.println("name e:");
		System.out.println(e);
		System.out.println("email:");
		System.out.println(email);
		System.out.printf("set email::",email);
		System.out.println();
		System.out.printf("this.email======",email);
		System.out.println();
		*/
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String uname) {
	username = uname;
		//System.out.printf("set username::",username);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String pwd) {
		password = pwd;
		// System.out.printf("set password::",password);
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mNo) {
		mobileNo = mNo;
	}

	
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	private String location;

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
