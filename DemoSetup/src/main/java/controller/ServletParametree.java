package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletParametree
 */
@WebServlet("/ServletParametree")
public class ServletParametree extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Passage dans le doGet");
		String nom = request.getParameter("nom");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append("Vous vous appelez : " + nom.toUpperCase());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Passage dans le doPost");
		String nom = request.getParameter("nom");
		response.getWriter().append("Vous vous appelez : " + nom);
	}

}
