package com.example.Day7.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	@Id
	private int id;
	private String carName;
	private String carTypre;
	private int owners;
	private String currentOwnerName;
	private long mobile;
	private String address;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String carName, String carTypre, int owners, String currentOwnerName, long mobile,
			String address) {
		super();
		this.id = id;
		this.carName = carName;
		this.carTypre = carTypre;
		this.owners = owners;
		this.currentOwnerName = currentOwnerName;
		this.mobile = mobile;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarTypre() {
		return carTypre;
	}

	public void setCarTypre(String carTypre) {
		this.carTypre = carTypre;
	}

	public int getOwners() {
		return owners;
	}

	public void setOwners(int owners) {
		this.owners = owners;
	}

	public String getCurrentOwnerName() {
		return currentOwnerName;
	}

	public void setCurrentOwnerName(String currentOwnerName) {
		this.currentOwnerName = currentOwnerName;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
