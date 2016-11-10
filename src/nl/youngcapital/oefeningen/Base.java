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

	private static String userName;
	private static String favoriteNumber;
	private static String otherNumber;
	private static String calculation;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		userName = request.getParameter("userName");
		favoriteNumber = request.getParameter("favoriteNumber");
		otherNumber = request.getParameter("otherNumber");
		calculation = request.getParameter("calculation");
		
		
		
		response.getWriter().append(
				
				"<!DOCTYPE html><html><head>" +
				"<title>Base</title>" +
				"<head><body><h1>Dit is de basis.</h1>"
				+ "<form method = get action = >"
				+ "Wat is uw naam? <input type = \"text\" name = \"userName\"><br>"
				+ "Lievelingsnummer <input type = \"number\" name = \"favoriteNumber\"><br>"
				+ "<input type = \"submit\"><br>"
				+ "Maak een keuze!<br>"
				+ "<input type = \"radio\" name = \"otherNumber\" value = \"200\" /> 200"
				+ "<input type = \"radio\" name = \"otherNumber\" value = \"400\" /> 400"
				+ "<input type = \"radio\" name = \"otherNumber\" value = \"404\" /> 404"
				+ "<input type = \"radio\" name = \"otherNumber\" value = \"418\" /> 418"
				+ "<input type = \"radio\" name = \"otherNumber\" value = \"500\" /> 500<br>"
				
				+ "Wat wil je doen? <select name = \"calculation\">"
				+ "<option value = \"add\">Optellen</option>"
				+ "<option value = \"substract\">Aftrekken</option>"
				+ "<option value = \"multipli\">Vermegingvuldigen</option>"
				+ "<option value = \"devide\">Delen</option></select> "
				+ "</form>"
				);
		
				if(userName != null){
					response.getWriter().append("<h1>Welkom, " + userName + "</h1><br>");
				}
				
				if(favoriteNumber != null && otherNumber != null ){
				int answer = 0;
				
					switch(calculation){
						case "add": answer = Integer.parseInt(favoriteNumber) + Integer.parseInt(otherNumber); break;
						case "substract": answer = Integer.parseInt(favoriteNumber) - Integer.parseInt(otherNumber); break;
						case "multipli": answer = Integer.parseInt(favoriteNumber) * Integer.parseInt(otherNumber); break;
						case "devide": answer = Integer.parseInt(favoriteNumber) / Integer.parseInt(otherNumber); break;
					}
				
				response.getWriter().append("Antwoord:  " + answer);
				}
				
				response.getWriter().append("</body></html>");
		
				
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
