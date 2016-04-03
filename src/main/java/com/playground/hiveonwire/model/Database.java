package com.playground.hiveonwire.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Database {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Database() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Database(String name) {
		super();
		this.name = name;
	}

}
