package com.example.ZipZap.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "job")
public class Job {
	
	@Id
	private int packid;
	private int deliverymanid;
	private int sender;
	private int receiver;
	private String status;
	private int cost;
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job(int packid, int deliverymanid, int sender, int receiver, String status, int cost) {
		super();
		this.packid = packid;
		this.deliverymanid = deliverymanid;
		this.sender = sender;
		this.receiver = receiver;
		this.status = status;
		this.cost = cost;
	}

	public int getPackid() {
		return packid;
	}

	public void setPackid(int packid) {
		this.packid = packid;
	}

	public int getDeliverymanid() {
		return deliverymanid;
	}

	public void setDeliverymanid(int deliverymanid) {
		this.deliverymanid = deliverymanid;
	}

	public int getSender() {
		return sender;
	}

	public void setSender(int sender) {
		this.sender = sender;
	}

	public int getReceiver() {
		return receiver;
	}

	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void compare(Job j) {
		if(j.getDeliverymanid() != this.getDeliverymanid())
		{
			this.setDeliverymanid(j.getDeliverymanid());
		}
		if(j.getStatus() != null)
		{
			this.setStatus(j.getStatus());
		}
	}
}
