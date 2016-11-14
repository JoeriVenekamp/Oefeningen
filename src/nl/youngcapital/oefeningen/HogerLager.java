package nl.youngcapital.oefeningen;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HogerLager")
public class HogerLager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getSession(false) == null){
			request.getRequestDispatcher("/WEB-INF/WelcomeHogerLager.jsp").forward(request, response);
		}
		
//		request.setAttribute("userName", userName);
//		request.setAttribute("output", output);
//		request.setAttribute("countOutput", countOutput);
//		
		request.getRequestDispatcher("/WEB-INF/HogerLager.jsp").forward(request, response);				
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
//		guess = request.getParameter("guess");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("guess", (String) request.getParameter("guess"));
		
		if(session.getAttribute("guess") != null){
	
			
//			if(answer == Integer.parseInt(guess)){
//				output = "Je hebt Gewonnen!";
//			}
//			
//			else if (answer < Integer.parseInt(guess)){
//				output = "Hint: Lager dan " + guess;
//			}
//			
//			else if (answer > Integer.parseInt(guess)){
//				output = "Hint: Hoger dan " + guess;
//			}
//			
//		count++;
//		
//		countOutput = "Je hebt " + count + " maal geraden.";
		
		}	

		request.getRequestDispatcher("/WEB-INF/HogerLager.jsp").forward(request, response);	
		
	}

}
