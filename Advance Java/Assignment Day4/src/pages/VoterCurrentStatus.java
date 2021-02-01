package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojos.Voter;

/**
 * Servlet implementation class VoteSuccessfull
 */
@WebServlet("/currentStatus")
public class VoterCurrentStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		HttpSession hs = request.getSession();
		Voter voter = (Voter) hs.getAttribute("userDetails");
		
		try(PrintWriter pw = response.getWriter()){
			pw.print("<title>Voting Successufull</title>");
			pw.print("Hello, <b>" + voter.getName() +"</b> , you have already voted!");
		}
	}

}
