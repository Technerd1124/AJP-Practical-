import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookies")
public class Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Cookies() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String orderedCookie = request.getParameter("orderedCookie");
		String quantity = request.getParameter("quantity");
		response.addCookie(new Cookie("name", name));
		response.addCookie(new Cookie("orderedCookie", orderedCookie));
		response.addCookie(new Cookie("quantity", quantity));
		PrintWriter pw = response.getWriter();
		pw.println(
				"<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css' integrity='sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2' crossorigin='anonymous' /> <script defer src='https://code.jquery.com/jquery-3.5.1.slim.min.js' integrity='sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj' crossorigin='anonymous' ></script> <script defer src='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js' integrity='sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx' crossorigin='anonymous' ></script><div class='container'><h1 style='text-align:center'>Ordered Cookie</h1><table class='table table-bordered'><thead class='thead-dark'><tr><th scope='col'>Name</th><th scope='col'>Value</th></tr></thead><tbody>");

		Cookie[] cookies = request.getCookies();

		for (Cookie cookie : cookies) {
			String cookieName = cookie.getName();
			String cookieValue = cookie.getValue();
			pw.println("<tr><td scope='row'>" + cookieName + "</td><td>" + cookieValue + "</td></tr>");
		}
		pw.println("</tbody></div></div>");
		for (Cookie cookie : cookies) {
			cookie.setValue("");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
