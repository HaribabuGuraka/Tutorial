package com.my;

public class User {

	private String name;
	private int age;
	private String country;
	private String job;
	//private Address address = new Address();
	private Address address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
		
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUserValues() {
		//address  =   new  Address();
		return name + " is " + age + " years old, living in " + country+" and Address is"+address.getLocation()+" ---> Mobile No is "+address.getLandlineno();
	}
	
	// normal method
	
	public String getUserPersonalInfo()
	{
		
		return " Personal information of user ="+address.getPersonal().getDesignation()+" : "+address.getPersonal().getJobdesc();
	}
	

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public void callPersonalDetail()
	{
		System.out.println("Personal details....."+getAddress().getPersonal().getDesignation());
		
	}
	
}
