package com.darbuth.random.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RandomWord
 */
@WebServlet("/RandomWord")
public class RandomWord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomWord() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null) {
			session = request.getSession();
			session.setAttribute("count", 0);
		}
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/word.jsp");
        view.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Random r = new Random();
		String[] rand_chars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		List<String> rand_list = Arrays.asList(rand_chars);
		String rand_word = "";
		for (int i = 0; i < 10; i++) {
			Integer num = r.nextInt(35);
			rand_word += rand_list.get(num);
		}
		Integer count = (Integer) session.getAttribute("count");
		session.setAttribute("count", count + 1);
		session.setAttribute("word", rand_word);
		session.setAttribute("timestamp", new SimpleDateFormat("MMMM dd, yyyy - hh:mm a").format(new Date()));
		String word = request.getParameter("word");
		System.out.println(word);
		System.out.println("Goodbye");
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/word.jsp");
        view.forward(request, response);
	}

}
