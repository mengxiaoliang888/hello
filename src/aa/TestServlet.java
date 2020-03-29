package aa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public TestServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");		
		PrintWriter out = response.getWriter();
		int first = Integer.parseInt(request.getParameter("first")); 
		int second = Integer.parseInt(request.getParameter("second"));
		int result=first+second;		
		out.println(result); 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");//…Ë÷√‘ –ÌøÁ”Ú∑√Œ 
		request.setCharacterEncoding("utf-8");		
		PrintWriter out = response.getWriter();
		int first = Integer.parseInt(request.getParameter("first")); 
		int second = Integer.parseInt(request.getParameter("second"));
		int result=first+second;
		System.out.println(result); 
		out.println(result); 
	}

}
