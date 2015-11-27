package com.my;

public class Address {
	
	private  String location;
	private  long   landlineno;
	//private Personal personal = new Personal();
	private Personal personal;
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getLandlineno() {
		return landlineno;
	}
	public void setLandlineno(long landlineno) {
		this.landlineno = landlineno;
	}
		
	public String getDetails()
	{
		return location+":"+landlineno;
	}
	/**
	 * @return the personal
	 */
	public Personal getPersonal() {
		return personal;
	}
	/**
	 * @param personal the personal to set
	 */
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}


}
