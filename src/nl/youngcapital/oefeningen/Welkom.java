package nl.youngcapital.oefeningen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Welkom")
public class Welkom extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getSession() != null) {
			request.getRequestDispatcher("/WEB-INF/HogerLager.jsp").forward(request, response);

			request.getRequestDispatcher("/WEB-INF/WelcomeHogerLager.jsp");

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("userName", (String) request.getParameter("username"));
		
		session.setAttribute("answer", (int)(Math.random()*100));
		
		session.setAttribute("count", (int) 0);
		
		response.sendRedirect("HogerLager");

	}

}