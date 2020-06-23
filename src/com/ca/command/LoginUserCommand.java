package com.ca.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.SysexMessage;

import com.ca.business.Flower;
import com.ca.business.User;
import com.example.service.PlantService;
import com.example.service.UserService;

public class LoginUserCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repsonse){
			
		UserService userService = new UserService();
		String forwardToJsp = "";		

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		
		//Check we have a username and password...
		if (username != null && password != null){

			//Make call to the 'Model' using the UserServive class to login...
			User userLoggingIn = userService.login(username, password);
			System.out.println("->>>>>>>>>>>>>>" + username);
			if (userLoggingIn != null){

				//If login successful, store the session id for this client...
				HttpSession session = request.getSession();
				String clientSessionId = session.getId();
				session.setAttribute("loggedSessionId", clientSessionId);

				session.setAttribute("user", userLoggingIn);

				forwardToJsp = "/SearchPage.jsp";				
			}
			else{
				forwardToJsp = "/loginFailure.jsp";	
			}
		}
		else {
			forwardToJsp = "/loginFailure.jsp";	
		}
		
		PlantService flowerService = new PlantService();	
		
		List<Flower> flowerList = flowerService.getAllPlants();


		/*for (Flower f : flowerList){ 
			System.out.println("------\n");
			System.out.println(f.getId());
			System.out.println(f.getImage());
			System.out.println(f.getFlowerName());
		}
*/

		HttpSession session = request.getSession();
		String clientSessionId = session.getId();
		session.setAttribute("flowers", flowerList);
		
		return forwardToJsp = "/SearchPage.jsp";	
		
	}

}
