package nl.youngcapital.oefeningen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welkom
 */
@WebServlet("/Welkom")
public class Welkom extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static String userName;
	private static String favoriteNumber;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	userName= request.getParameter("userName");
	favoriteNumber = request.getParameter("favoriteNumber");
		
	response.getWriter()
	
	
		
		.append("<!DOCTYPE html><html><head>" +
			"<title>mijn eerste servlet</title>" +
			"<head><body><h1>Welkom, " + userName + "</h1><br>" +
			"Nummer: " + favoriteNumber +
			"</body></html>");
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
