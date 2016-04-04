package com.playground.hiveonwire.model;

public class Table {
	
	private String name;
	private String location;
	private boolean isExternal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isExternal() {
		return isExternal;
	}
	public void setExternal(boolean isExternal) {
		this.isExternal = isExternal;
	}
	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Table(String name, String location, boolean isExternal) {
		super();
		this.name = name;
		this.location = location;
		this.isExternal = isExternal;
	}

}
