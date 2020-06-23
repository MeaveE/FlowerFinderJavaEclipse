package com.ca.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ca.business.Flower;
import com.example.service.PlantService;

public class SearchCommand implements Command {
	@Override 
	public String execute(HttpServletRequest request, HttpServletResponse repsonse){
			
		String forwardToJsp = "";		

		String search= request.getParameter("flowerserach");
		System.out.println("SSSSSSSSSSSS "+search);
		//Check we have a query...
		if (search != null){

			//Make call to the 'Model' using the UserServive class to login...
			List<Flower> flowerFind = PlantService.find(search);

			if (flowerFind != null){
						//overwrite arraylist
				List<Flower> flowerList = flowerFind;
				
				HttpSession session = request.getSession();
				String clientSessionId = session.getId();
				session.setAttribute("flowers", flowerList);
				System.out.println("SSSSSSSSSSSS"+flowerList);
				forwardToJsp = "/SearchPage.jsp";				
			}
			else{
				forwardToJsp = "/loginFailure.jsp";	
			}
		}
		else {
			forwardToJsp = "/loginFailure.jsp";	
		}
		return "/SearchPage.jsp";
	}


}
