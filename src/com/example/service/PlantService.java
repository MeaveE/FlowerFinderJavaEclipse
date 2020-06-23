package com.example.service;

import java.util.List;

import com.ca.business.Flower;
import com.ca.dao.PlantDao;
import com.ca.exceptions.DaoException;

public class PlantService {

	static PlantDao dao = new PlantDao();

	
	public static List<Flower> find(String search) {
		
		List<Flower> flow = null;
		try {			
			flow = dao.findPlant(search);
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		
		return flow;
	}

	public static List<Flower> getAllPlants() {
		// TODO Auto-generated method stub
		List<Flower> flowers;
		
		flowers = dao.getAllPlants();
		
		return flowers;
	}
}
