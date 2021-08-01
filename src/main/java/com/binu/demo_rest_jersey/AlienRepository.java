package com.binu.demo_rest_jersey;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

	
	List<Alien> aliens = new ArrayList<>();
	
	public AlienRepository() {
		aliens = new ArrayList<>();
		
		Alien a1 = new Alien();
		a1.setName("John");
		a1.setPoints(88);

		Alien a2 = new Alien();
		a1.setName("Alice");
		a1.setPoints(94);
		
		aliens.add(a1);
		aliens.add(a2);
	}
	
	public List<Alien> getAliens(){
		
		return aliens;
	}
	
	public Alien getAlien(int id) {
		
		Alian a1 = null;
		
		for (Alien a: aliens) {
			if (a.getId() == id) {
				return a;
			}
		}
		
		return null;
		
	}
	
	
}
