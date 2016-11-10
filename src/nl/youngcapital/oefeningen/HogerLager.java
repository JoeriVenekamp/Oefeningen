package nl.youngcapital.oefeningen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HogerLager
 */
@WebServlet("/HogerLager")
public class HogerLager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static int answer = (int)(Math.random()*100);
	public static int count = 0;
	public static String guess;
	public static String hint;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append(
				"<!DOCTYPE html><html><head>" +
				"<title>HogerLager</title>" +
				"<head><body><h1>Hoger of Lager!</h1>" +
				"Raad het getal <form method = get action = >" +
				"<input type = \"text\" name = \"guess\">" +
				"<intput type = \"submit\"><br>");
			
				guess = request.getParameter("guess");
				
				if(guess != null){
					
					if(answer == Integer.parseInt(guess)){
						response.getWriter().append("Gewonnen!");
			
					}
					
					else if (answer < Integer.parseInt(guess)){
						hint = "Lager";
					}
					
					else if (answer > Integer.parseInt(guess)){
						hint = "Hoger";
					}
					
					response.getWriter().append("Hint: " + hint + " dan " + guess + "<br>" +
					"Aantal keer geraden: " + ++count);
				}		
						
				response.getWriter().append("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
