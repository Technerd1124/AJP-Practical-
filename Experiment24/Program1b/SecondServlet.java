
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			Cookie ck[] = request.getCookies();
			out.print("Hello " + ck[0].getValue());
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
