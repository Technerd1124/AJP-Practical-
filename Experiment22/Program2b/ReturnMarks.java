
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReturnMarks")
public class ReturnMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReturnMarks() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("name");
		String department = request.getParameter("department");
		float percentage = Float.parseFloat(request.getParameter("percentage"));
		String year = request.getParameter("year");

		pw.println(
				"<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css' integrity='sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2' crossorigin='anonymous' /> <script defer src='https://code.jquery.com/jquery-3.5.1.slim.min.js' integrity='sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj' crossorigin='anonymous' ></script> <script defer src='https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js' integrity='sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx' crossorigin='anonymous' ></script> <style>.main{width:100vw;height:100vh;display:flex;justify-content:center;align-items:center}.card{text-align:center}.row{margin-bottom:5px;margin-top:5px}</style><div class='container main'><div class='card' style='width: 500px'><div class='card-header'><h4>"
						+ name
						+ "</h4></div><div class='card-body'><ul class='list-group list-group-flush'></ul><li class='list-group-item'><div class='row'><div class='col-6'>Department</div><div class='col-6'>"
						+ department
						+ "</div></div></li><li class='list-group-item'><div class='row'><div class='col-6'>Year</div><div class='col-6'>"
						+ year
						+ "</div></div></li><li class='list-group-item'><div class='row'><div class='col-6'>Percentage</div><div class='col-6'>"
						+ percentage
						+ "</div></div></li><li class='list-group-item'><div class='row'><div class='col-6'>Status</div><div class='col-6'>"
						+ (percentage > 35 ? "Passed" : "Failed") + "</div></div></li></ul></div></div></div>");
		pw.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
