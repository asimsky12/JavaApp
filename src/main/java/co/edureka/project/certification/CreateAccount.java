package co.edureka.project.certification;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/accCreation")
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<body bgcolor=cyan");
		out.println("form action=transaction method=get");
		out.println("<h2>");
		out.println("Name <input type=text name=Name size=25> <br><br>");
		out.println("DOB <input type = text name=DOB size=25> <br><br>");
		out.println("Address <input type=text name=Address size=105> <br><br>");
		out.println("EmailID <input type=text name=Email size=25> <br><br>");
		out.println("BankType <input type=text name=BankType size=25> <br><br>");
		out.println("<input type=submit value = Create Account");
		out.println("</form></body>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
