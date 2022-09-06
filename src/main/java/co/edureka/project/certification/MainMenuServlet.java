package co.edureka.project.certification;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/creation")
public class MainMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>create account</title></head");
		
		out.println("<body style=background-color:lightgreen;text-align:left>");
		out.println("<h1>Banking System</h1>");
		out.println("<hr>");
		out.println("<p>create account</p>");
		out.println("<p>Transaction</p>");
		out.println("<p>Display Statement</p>");
		out.println("<p>Authorize Credit Card Transaction</p>");
		out.println("</body></html>");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
