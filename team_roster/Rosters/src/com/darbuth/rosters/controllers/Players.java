package com.darbuth.rosters.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.darbuth.rosters.models.Player;
import com.darbuth.rosters.models.Team;

/**
 * Servlet implementation class Players
 */
@WebServlet("/Players")
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Players() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Boolean create_player = Boolean.valueOf(request.getParameter("create_player"));
		request.setAttribute("create_player", create_player);
		Integer team_id = Integer.valueOf(request.getParameter("id"));
		Team t = Team.findTeam(team_id);
		session.setAttribute("team", t);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/player.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String first = request.getParameter("first_name");
		String last = request.getParameter("last_name");
		Integer age = Integer.valueOf(request.getParameter("age"));
		Player new_player = new Player(first, last, age);
		Team t = (Team) session.getAttribute("team");
		t.addPlayer(new_player);
		response.sendRedirect("Home");
	}

}
