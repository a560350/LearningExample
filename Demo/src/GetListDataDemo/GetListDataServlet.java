package GetListDataDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetListDataServlet
 */
@WebServlet("/GetListDataServlet")
public class GetListDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetListDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String selected_Comments[] = request.getParameterValues("comments") ;
			PrintWriter writer = response.getWriter();
		     response.setContentType("text/html");
			 writer.println("<h4>You are selected  :</h4>");
			 HttpSession session=request.getSession(true);
			 session.setAttribute("selected_Comments", selected_Comments);
						 
			/*for(String comment :selected_Comments)
			{
			 writer.println("<br><font color=black>"+comment+"</font>");}*/
			 getServletConfig().getServletContext().getRequestDispatcher("/hello.jsp").forward(request,response);
			 writer.close();
		     }catch(Exception exception){
		        exception.printStackTrace();}
	}

}
