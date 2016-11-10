

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Person")
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String naam = "Joeri";
		int leeftijd = 29;
		
		request.setAttribute("Naam", naam);
		request.setAttribute("Leeftijd", leeftijd);
		
		request.getRequestDispatcher("/WEB-INF/Person.jsp").forward(request, response);
	}


}
