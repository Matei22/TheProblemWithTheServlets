package com;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("Session Created. listener will be invoked");
		session.setAttribute("username", "Tom");
		session.setAttribute("password", "Jerry");
		System.out.println("Session atributes displayed. listener to come here");
		session.setAttribute("username", "Jim");
		System.out.println("Atribute modified. listener will be invoke");
		session.invalidate();
		System.out.println("Atribute Destroyed");

		
		
		
		
		
	
	}

}
