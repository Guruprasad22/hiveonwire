package com.playground.hiveonwire.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.playground.hiveonwire.model.Database;

public class DatabaseService {
	MockDatabase mockDb = new MockDatabase();
	private Map<String,ArrayList<Database>> databases = MockDatabase.getDatabases();

	public List<Database> getAllDatabases() {
		ArrayList<Database> myList = new ArrayList<Database>();
	    for(Object obj:databases.values()) {
	    	myList.addAll((ArrayList<Database>)obj);
	    }
		return myList;
	}

	public Database addDatabase(Database db) {
		ArrayList<Database> temp = new ArrayList<Database>();
		temp.add(db);
		databases.put("temp"+databases.size()+1,temp);
		return db;
	}
	
	public Database updateDatabase(Database db) {
		ArrayList<Database> temp = new ArrayList<Database>();
		temp.add(db);
		databases.put("dev1",temp);
		return db;
	}
	
	public ArrayList<Database> deleteDatabase(Database db) {
		return databases.remove("dev1");
		
	}
	
	public ArrayList<Database> getDatabase(String enviroment) {
		return databases.get(enviroment);
	}
	
	
}
