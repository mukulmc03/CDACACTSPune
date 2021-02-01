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

import dao.CandidatesDaoImpl;
import pojos.Candidate;

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
			ArrayList<Candidate> candidateList = candidateDao.getCandidateList();
			pw.println(candidateList);
		}
		catch(Exception e) {
			throw new ServletException("Error is CandidatesList do-get : " +getClass().getName(), e);
		}
	}
}
