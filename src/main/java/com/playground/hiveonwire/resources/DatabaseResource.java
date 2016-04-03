package com.playground.hiveonwire.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.playground.hiveonwire.model.Database;
import com.playground.hiveonwire.service.DatabaseService;

@Path("/databases")
public class DatabaseResource {
	
	DatabaseService dbService = new DatabaseService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Database> getDatabases() {
		return dbService.getAllDatabases();
	}
	
}
