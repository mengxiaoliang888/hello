package Hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public hello() {
        super();
       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		request.setCharacterEncoding("utf-8");		
		PrintWriter out = response.getWriter();
		String first = request.getParameter("first"); 
		String second = request.getParameter("second");
		String result=first+second;
		System.out.println(result); 
		out.println(result); 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		request.setCharacterEncoding("utf-8");		
		PrintWriter out = response.getWriter();
		String first = request.getParameter("first"); 
		String second = request.getParameter("second");
		String result=first+second;
		System.out.println(result); 
		out.println(result);  
	}

}
