package com.playground.hiveonwire.service;

import java.util.ArrayList;
import java.util.List;

import com.playground.hiveonwire.model.Database;

public class DatabaseService {

	public List<Database> getAllDatabases() {
		Database db3 = new Database("sample_01");
		Database db1 = new Database("sample_02");
		Database db2 = new Database("sample_03");
		List<Database> myList = new ArrayList<Database>();
		myList.add(db1);
		myList.add(db2);
		myList.add(db3);

		return myList;
	}
}
