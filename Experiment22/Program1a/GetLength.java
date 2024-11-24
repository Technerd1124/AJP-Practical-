
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GetLength")
public class GetLength extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetLength() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String responseString[] = {
				"<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css'>",
				"<script defer src='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js'></script>" };
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String s = request.getParameter("username");
		for (String str : responseString) {
			pw.println(str);
		}
		pw.println("<div class='container'><h3>The Length of the Username is " + s.length() + "</h3></div>");
		pw.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
