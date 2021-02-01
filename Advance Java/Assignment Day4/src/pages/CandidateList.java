package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CandidatesDaoImpl;
import pojos.Candidate;
import pojos.Voter;

/**
 * Servlet implementation class CandidateList
 */
@WebServlet("/candidateList")
public class CandidateList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CandidatesDaoImpl candidateDao;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			candidateDao = new CandidatesDaoImpl();
		} catch (Exception e) {
			throw new ServletException("Error in CandidatesList init : " + getClass().getName(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			candidateDao.cleanUp();
		}
		catch(Exception e) {
			throw new RuntimeException("Error in CandidatesList destroy : " + getClass().getName(), e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter()){
			//get HttpSession (existing) from WebContainer
			HttpSession hs = request.getSession();
			
			//get client details from session scope
			Voter voter = (Voter) hs.getAttribute("userDetails");
			
			ArrayList<Candidate> candidateList = candidateDao.getCandidateList();
			pw.print("<title>Candidate List</title>");
			pw.print("Hello, <b>" + voter.getName() + "</b> you have not yet voted! <br><br>"
					+ "Candidate List : ");
			pw.println("<form action = 'voteSuccess'>");
			for(Candidate c : candidateList)
				pw.print("<input type = 'radio' name = 'cid' value = " + c.getId() + "> Name : " + c.getName() +" Party : " + c.getParty() + "</input><br>");
			pw.print("<br><br><input type = 'submit' value = 'Vote Now'</input>");
			pw.print("</form>");
		}
		catch(Exception e) {
			throw new ServletException("Error is CandidatesList do-get : " +getClass().getName(), e);
		}
	}
}
