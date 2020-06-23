package com.example.service;


import com.ca.business.User;
import com.ca.dao.UserDao;
import com.ca.exceptions.DaoException;

public class UserService {

	UserDao dao = new UserDao();
	
	public User login(String username, String password){
		
		User u = null;
		try {			
			u = dao.findUserByUsernamePassword(username, password);
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		return u;
		
	}
	public String getAllUsers() {
		
		return null;
	}
	
	
}
