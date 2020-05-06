package com.capgemini.online_test_management.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
	private String name;
	
	@Id
    @GeneratedValue
	private Long rollno;
	
	@NotNull
    @NotEmpty(message = "Email address cannot be empty")
    @Email(message = "Invalid email address, e.g. valid email address: example@gmail.com")
	private String email;
	
	@NotNull
    @Size(min = 10, max = 12)
    @Digits(fraction = 0, integer = 12, message = "Incorrect Format, valid e.g. 121212121212")
    @Column(name = "phone_number")
	private String phoneNumber;

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRollno() {
		return rollno;
	}

	public void setRollno(Long rollno) {
		this.rollno = rollno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", rollno=" + rollno + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

	public User(String name, Long rollno, String email, String phoneNumber) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	

}
