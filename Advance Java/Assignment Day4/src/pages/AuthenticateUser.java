package pages;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class AuthenticateUser
 */
@WebServlet("/validateUser")
public class AuthenticateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VoterDaoImpl voterDao;
	private CandidatesDaoImpl candidateDao;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		try {
			voterDao = new VoterDaoImpl();
			candidateDao = new CandidatesDaoImpl();
		}
		catch(Exception e) {
			throw new ServletException("Error in init : " + getClass().getName(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			voterDao.cleanUp();
		}
		catch(Exception e) {
			throw new RuntimeException("Error in : " + getClass().getName(), e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String email = request.getParameter("em");
		String password = request.getParameter("pass");
		System.out.println("In Auth User's doPost " + email + " " + password);
		
		try(PrintWriter pw = response.getWriter()){
			Voter voter = voterDao.validateVoter(email, password);
			
			//check login fail or success
			if(voter == null)
				pw.print("<h3>Invalid Credentials! Please, <a href = 'login.html'>retry</a></h3>");
			else {
				
				//get HttpSession from WebContainer
				HttpSession session = 	request.getSession();
				
				//to check if session is new or not along with it's ID
				System.out.println("From AuthenticateUser page session is New : " + session.isNew());
				System.out.println("Session ID : " + session.getId());
				
				//set validated client details under session scope
				session.setAttribute("userDetails", voter);
				session.setAttribute("candidateDetails", candidateDao);
				
				if(voter.getRole().equals("admin")) {
					response.sendRedirect("admin");
				}
				else {
					//if voter has voted 
					if(voter.getStatus() == 1)
						response.sendRedirect("currentStatus");
					else
						response.sendRedirect("candidateList");
				}
			}
		}
		catch(Exception e) {
			throw new ServletException("Error in validateUser do-post : " + getClass().getName(), e);
		}
	}

}
