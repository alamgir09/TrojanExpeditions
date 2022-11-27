import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter(); 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		printData(username, password);

	}

	private void printData(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("username: " + username);
		System.out.println("password: " + password);
	}
}
