package com.binu.demo_rest_jersey;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	AlienRepository repo = new AlienRepository();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() {
		
		System.out.println("getAlien() method was called");
		
//		Alien a1 = new Alien();
//		a1.setName("John");
//		a1.setPoints(88);
//
//		Alien a2 = new Alien();
//		a1.setName("Alice");
//		a1.setPoints(94);
//		
//		List<Alien> aliens = Arrays.asList(a1,a2);
		
		return repo.getAliens();
	}
	
	
}
