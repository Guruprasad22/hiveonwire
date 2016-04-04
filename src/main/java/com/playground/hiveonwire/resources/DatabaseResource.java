package com.playground.hiveonwire.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.playground.hiveonwire.model.Database;
import com.playground.hiveonwire.service.DatabaseService;

@Path("/databases")
public class DatabaseResource {
	
	DatabaseService dbService = new DatabaseService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Database> getDatabases() {
		return dbService.getAllDatabases();
	}
	
	@GET
	@Path("/{env}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Database> getDatabase(@PathParam("env") String environment) {
		ArrayList<Database> myList = dbService.getDatabase(environment);
		return myList;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String updateDatabase(Database db) {
		dbService.addDatabase(db);
		return "got it again!!";
	}
	
	
}
