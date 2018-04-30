package com.darbuth.game.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NumGame
 */
@WebServlet("/Game")
public class NumGame extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumGame() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null) {
			session = request.getSession();
			Random r = new Random();
			Integer num = r.nextInt(99) + 1;
			session.setAttribute("num", num);
			session.setAttribute("outcome", null);
		}
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session = request.getSession();
		Boolean replay = Boolean.valueOf(request.getParameter("replay"));
		if (replay) {
			session.invalidate();
			doGet(request, response);
		} else {
			if (request.getParameter("guess") == "") {
				session.setAttribute("guess", 0);
			} else {
				Integer g = Integer.valueOf(request.getParameter("guess"));
				session.setAttribute("guess", g);
			}
			if (session.getAttribute("num") == session.getAttribute("guess")) {
				session.setAttribute("outcome", true);
			}
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
			view.forward(request, response);
		}
	}

}
