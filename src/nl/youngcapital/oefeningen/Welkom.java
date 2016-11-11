package nl.youngcapital.oefeningen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welkom
 */
@WebServlet("/Welkom")
public class Welkom extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/WelcomeHogerLager.jsp").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Cookie userName = new Cookie ("userName", request.getParameter("userName"));
		response.addCookie(userName);
		
		request.getRequestDispatcher("/WEB-INF/HogerLager.jsp").forward(request, response);
		
	}

}
