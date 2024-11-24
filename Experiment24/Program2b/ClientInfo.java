
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ClientInfo")
public class ClientInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ClientInfo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		pw.println(
				"<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css' integrity='sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2' crossorigin='anonymous' /> <script defer src='https://code.jquery.com/jquery-3.5.1.slim.min.js' integrity='sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj' crossorigin='anonymous' ></script> <script defer src='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js' integrity='sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx' crossorigin='anonymous' ></script><style>.container{display:flex;align-item:center;justify-content:center;height:100vh;flex-direction:column}</style><div class='container'><h1 style='text-align:center'>Browser Info</h1><br/><table class='table table-bordered'><thead class='thead-dark'><tr><th scope='col'>Name</th><th scope='col'>Value</th></tr></thead><tbody>");

		String[][] browserInfo = { { "User Agent", request.getHeader("User-Agent") },
				{ "Client IP Address", request.getRemoteAddr() },
				{ "Requested URL", new String(request.getRequestURL()) }, { "Client OS", getClientOS(request) } };

		for (String[] info : browserInfo) {
			pw.println("<tr><td scope='row'>" + info[0] + "</td><td>" + info[1] + "</td></tr>");
		}
		pw.println("</tbody></div>");

	}

	public String getClientOS(HttpServletRequest request) {
		final String browserDetails = request.getHeader("User-Agent");

		final String lowerCaseBrowser = browserDetails.toLowerCase();
		if (lowerCaseBrowser.contains("windows")) {
			return "Windows";
		} else if (lowerCaseBrowser.contains("mac")) {
			return "Mac";
		} else if (lowerCaseBrowser.contains("x11")) {
			return "Unix";
		} else if (lowerCaseBrowser.contains("android")) {
			return "Android";
		} else if (lowerCaseBrowser.contains("iphone")) {
			return "IPhone";
		} else {
			return "UnKnown, More-Info: " + browserDetails;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
