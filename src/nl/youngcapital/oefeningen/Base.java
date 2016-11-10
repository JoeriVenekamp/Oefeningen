package nl.youngcapital.oefeningen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Base
 */
@WebServlet("/Base")
public class Base extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append(
				 
				
				
				"<!DOCTYPE html><html><head>" +
				"<title>Base</title>" +
				"<head><body><h1>Dit is de basis.</h1>"
				+ "<form method = get action = Welkom>"
				+ "Wat is uw naam? <input type = \"text\" name = \"userName\"><br>"
				+ "Lievelingsnummer <input type = \"number\" name = \"favoriteNumber\"><br>"
				+ "<input type = \"submit\"><br>"
				+ "Maak een keuze!<br>"
				+ "<input type = \"radio\" name = \"otherNumber\" value = \"200\" /> 200"
				+ "<input type = \"radio\" name = \"otherNumber\" value = \"400\" /> 400"
				+ "<input type = \"radio\" name = \"otherNumber\" value = \"404\" /> 404"
				+ "<input type = \"radio\" name = \"otherNumber\" value = \"418\" /> 418"
				+ "<input type = \"radio\" name = \"otherNumber\" value = \"500\" /> 500"
				
				+ "</form>"
				+ ""
				+ "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
