package pages;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CandidatesDaoImpl;
import dao.VoterDaoImpl;
import pojos.Voter;

/**
 * Servlet implementation class VoterStatusCheck
 */
@WebServlet("/voteSuccess")
public class VoteCastSuccessfull extends HttpServlet {
	private static final long serialVersionUID = 1L;
	VoterDaoImpl voterDao;
	CandidatesDaoImpl candidateDao;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			voterDao = new VoterDaoImpl();
			candidateDao = new CandidatesDaoImpl();
		} 
		catch (Exception e) {
			throw new ServletException("Error in VoterStatusCheck init : " + getClass().getName(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			voterDao.cleanUp();
		} catch (SQLException e) {
			throw new RuntimeException("Error in VoterStatus Check's destroy : " + getClass().getName(), e);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()){
			pw.print("<title>Voter Satatus Check</title>");
			
			// get HS from WC (rets : existing HS object)
			HttpSession hs = request.getSession();
			
			//get validate client details from session scope
			Voter voter = (Voter) hs.getAttribute("userDetails");
			
			//get candidate details from candidateList using request
			int candidateID = Integer.parseInt(request.getParameter("cid"));
			System.out.println(candidateID);
			
			voterDao.updateVotingStatus(voter.getId());
			candidateDao.incrementVotes(candidateID);
			
			if(voter != null) {
					pw.print("Hello, <b> " + voter.getName() + "</b>! You have voted successfully!");
			}
			
			hs.invalidate();
		}
		catch(Exception e) {
			throw new ServletException("Error in Voter Status Check's doGet : " + getClass().getName(), e);
		}
	}

}
