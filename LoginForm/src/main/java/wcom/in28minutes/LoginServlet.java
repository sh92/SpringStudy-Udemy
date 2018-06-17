package wcom.in28minutes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	private UserValidationService service = new UserValidationService();
	  protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		  request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
//		  PrintWriter out = response.getWriter();
//		  out.println("<html>");
//		  out.println("<head>");
//		  out.println("<title>Yahoo!!!!!!!!</title>");
//		  out.println("</head>");
//		  out.println("<body>");
//		  out.println("My First Servlet");
//		  out.println("</body>");
//		  out.println("</html>");
			  
	  }
	  
	  protected void doPost(HttpServletRequest request, 
			  HttpServletResponse response) throws ServletException, IOException {
		  
		  String name = request.getParameter("name");
		  String password = request.getParameter("password");
		  boolean isUserValid = service.isUserValid(name, password);
		  
		  if(isUserValid) {
			  request.setAttribute("name", name);
			  request.setAttribute("password", password);
			  request.getRequestDispatcher("/WEB-INF/view/welcome.jsp").forward(request,response);
		  }else {
			  request.setAttribute("errorMessage", "Invalid credential");
			  request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);			  
		  }
	  }
}
