package app.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(){
		System.out.println("Servlet Initialized");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<H1>");
		out.println("My First Servlet ceated on "+new java.util.Date());
		out.println("</H1>");
		out.println("</BODY>");
		out.println("</HTML>");		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
			doGet(request,response)	;
	}
	
	public void destroy(){
		System.out.println("Servlet destroyed");
	}

}
