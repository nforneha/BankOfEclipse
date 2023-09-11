package com.bank.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "PANNUMBER")
	private String panNumber;
	@Column(name = "CUSTNAME")
	private String custName;
	@Column(name = "CIBILSCORE")
	private int cibilScore;
	
	public void setPanNumber(String sPan) {
		this.panNumber=sPan;
	}
	public String getPanNumber() {
		return this.panNumber;
	}
	public void setCustName(String sNam) {
		this.panNumber=sNam;
	}
	public String getCustName() {
		return this.custName;
	}
	public void setCibilScore(String sCib) {
		this.panNumber=sCib;
	}
	public int getCibilScore() {
		return this.cibilScore;
	}
	
	public Customer() {
		super();
	}

}
