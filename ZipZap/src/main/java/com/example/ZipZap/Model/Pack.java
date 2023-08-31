package com.example.ZipZap.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pack {
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private int id;
	private int sender;
	private int receiver;
	private String status;
	
	public Pack(int id, int sender, int receiver, String status) {
		super();
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
		this.status = status;
	}

	public Pack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public void compare(Pack p) {
		if(p.getSender() != this.getSender())
		{
			this.setSender(p.getSender());
		}
		if(p.getReceiver() != this.getReceiver())
		{
			this.setReceiver(p.getReceiver());
		}
		if(p.getStatus() != this.getStatus())
		{
			this.setStatus(p.getStatus());
		}
	}
}