package com.orderManagementSystem.beans;

public class Customer {
	private int cid;
	private String cName;
	private String mob;
	
	public Customer() {
		super();
	}
	
	public Customer(int cid, String cName, String mob) {
		super();
		this.cid=cid;
		this.cName=cName;
		this.mob=mob;
	}
	
	public Customer (int cid) {
		super();
		this.cid=cid;
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("In hash Code : " + cid);
		return cid;
	}
	
	@Override 
	public boolean equals(Object obj) {
		System.out.println("In Equals to method : " + cid +  "------"  + ((Customer)obj).cid);
		return this.cid == ((Customer)obj).cid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cName=" + cName + ", mob=" + mob + "]";
	}
}
