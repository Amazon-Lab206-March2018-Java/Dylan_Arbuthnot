package com.darbuth.simple;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String firstName = "Unknown";
		String lastName = "Unknown";
		String favLang = "Unknown";
		String homeTown = "Unknown";
		if (request.getParameter("firstName") != null) {
			firstName = request.getParameter("firstName");
		}
		if (request.getParameter("lastName") != null) {
			lastName = request.getParameter("lastName");
		}
		if (request.getParameter("favLang") != null) {
			favLang = request.getParameter("favLang");
		}
		if (request.getParameter("homeTown") != null) {
			favLang = request.getParameter("homeTown");
		}
        PrintWriter header = response.getWriter();
        header.write("<h1>Hello World, you are smelly " + firstName + " " + lastName + "</h1>");
        header.write("<h3>Your favorite language is " + favLang + "</h3>");
        header.write("<h3>Your hometown is: " + homeTown + "</h3>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
