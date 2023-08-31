package com.example.ZipZap.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
 	private int id;
	private String name;
	private String password;
	private long phone;
	
	public Customer(int id, String name, String password, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void compare(Customer c) {
		if(c.getName() != null)
		{
			this.setName(c.getName());
		}
		if(c.getPassword() != null)
		{
			this.setPassword(c.getPassword());
		}
		if(c.getPhone() != this.getPhone())
		{
			this.setPhone(c.getPhone());
		}
	}
}
