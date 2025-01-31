package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import bo.Contact;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/contactDetails")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private static final List<Contact> contacts = Arrays.asList(
    		new Contact(1,"Cassin","Etienne",LocalDate.of(1992, 5, 5),"0255666388","url.url","Formateur","Informatique"),
    		new Contact(2,"Karim","Nadège",LocalDate.of(1996, 12, 30),"0668159232","https://www.facebook.com/XYZ","Développeur","Fullstack"),
    		new Contact(3,"Doukouré","Moustapha",LocalDate.of(1996, 12, 30),"0668159232","https://www.facebook.com/XYZ","Développeur","Fullstack")
    		 );
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int index = Integer.valueOf(request.getParameter("id"));
		request.setAttribute("contact", contacts.get(index));
		
		request.getRequestDispatcher("/WEB-INF/jsp/Contact.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
