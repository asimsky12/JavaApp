package co.edureka.project.certification;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static PreparedStatement pst;
	
	public void init(ServletConfig config) throws ServletException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka","root", "jstmaself");
			pst = con.prepareStatement("select * from user_pass where username = ? and password = ?");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get form data
				String uname = request.getParameter("txt_uid");
				String pass = request.getParameter("txt_pwd");
				
				try {
					pst.setString(1, uname);
					pst.setString(2, pass);
					
					ResultSet rs = pst.executeQuery();
					
					if(rs.next()) {
						RequestDispatcher rd = request.getRequestDispatcher("creation");
						rd.forward(request, response);
					}else {
						PrintWriter out = response.getWriter();
						out.println("<p style = font-size: 18px; color:yellow; text-align:center>Invalid User Name/Password</p>");
						
						RequestDispatcher rd = request.getRequestDispatcher("login.html");
						rd.include(request, response);
					}
				}catch (Exception e) {
					System.out.println(e.toString());
				}
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
