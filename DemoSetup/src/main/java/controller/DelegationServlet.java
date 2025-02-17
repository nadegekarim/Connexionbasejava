package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import bo.Personne;

/**
 * Servlet implementation class DelegationServlet
 */
@WebServlet("/Cachee")
public class DelegationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  request.setAttribute("prenom", "Etienne");
	  request.setAttribute("age", "32");
	  request.setAttribute("bonhomme", new Personne(1,"Toto",8));
		
		request.getRequestDispatcher("/WEB-INF/jsp/UneJSPAcessible.jsp").forward(request, response);
	   
	   
	}

	

}
