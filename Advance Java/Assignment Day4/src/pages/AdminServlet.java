package pages;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CandidatesDaoImpl;
import pojos.Candidate;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CandidatesDaoImpl candidateDao;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {

		} catch (Exception e) {
			throw new ServletException("Error in Admin's init : " + getClass().getName());
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			candidateDao.cleanUp();
		} catch (SQLException e) {
			throw new RuntimeException("Error in Admin's destroy : " + getClass().getName());
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		
		try(PrintWriter pw = response.getWriter()){
			pw.print("<title>Admin Panel </title>");
			pw.print("Hello , <b> Admin </b>! ");
			
			candidateDao = (CandidatesDaoImpl) hs.getAttribute("candidateDetails");
			
			ArrayList<Candidate> topTwoCandidatesList = candidateDao.getTopTwoCandidates();
			pw.print("<h2>Candidate List is : </h2>");
			pw.print("<ol>");
				for(Candidate c : topTwoCandidatesList)
					pw.print("<li>" + c + "</li>");
			pw.print("</ol>");
			
			HashMap<String, Candidate> partyMap = candidateDao.partyWiseAnalysis();
			
			pw.print("<h2>Party Analysis : </h2>");
			pw.print("<ul>");
			partyMap.forEach((i1, i2) -> pw.print("<li>" + i2.getParty() + " : " + i2.getVotes() + "</li>"));
			pw.print("</ul>");
		}
		catch(Exception e) {
			throw new ServletException("Error in Admin's do get : " + getClass().getName(), e);
		}
		
		//to invalidate session
		hs.invalidate();
	}

}
