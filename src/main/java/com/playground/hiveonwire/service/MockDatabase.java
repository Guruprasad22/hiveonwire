package com.playground.hiveonwire.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.playground.hiveonwire.model.Database;
import com.playground.hiveonwire.model.Table;

public class MockDatabase {

	private static Map<String,ArrayList<Database>>  databaseMap =  new HashMap<String,ArrayList<Database>>();
	private static Map<String,ArrayList<Table>>  tableMap =  new HashMap<String,ArrayList<Table>>();
	
	public MockDatabase() {
		
		ArrayList<Table> tableList = new ArrayList<Table>();
		tableList.add(new Table("table1","/some/location",true));
		tableList.add(new Table("table2","/some/location1",false));
		tableList.add( new Table("table3","/some/location2",true));
		tableMap.put("db1", tableList);

		ArrayList<Database> dbList = new ArrayList<Database>();
		dbList.add(new Database("database1"));
		dbList.add( new Database("database2"));
		dbList.add( new Database("database3"));
		databaseMap.put("dev", dbList);
	}
	
	public static Map<String,ArrayList<Database>> getDatabases() {
		return databaseMap;
	}
	
	public static Map<String,ArrayList<Table>> getTables() {
		return tableMap;
	}
	
}
