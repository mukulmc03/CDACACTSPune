package beans;

import java.sql.SQLException;

import dao.VoterDaoImpl;
import pojos.Voter;

public class VoterBeans {
	//client's conversational state (request parameters coming from client)
	private String email, password, message; 
	
	//manages VoterDao
	private VoterDaoImpl voterDao;
	
	//to store authenticated user details : Voter POJO
	private Voter userDetails;
	
	//add default argument less constructor
	public VoterBeans() throws ClassNotFoundException, SQLException {
		
		//create VoterDao instance
		voterDao = new VoterDaoImpl();
		System.out.println("VoterBean created!");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public VoterDaoImpl getVoterDao() {
		return voterDao;
	}

	public void setVoterDao(VoterDaoImpl voterDao) {
		this.voterDao = voterDao;
	}

	public Voter getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(Voter userDetails) {
		this.userDetails = userDetails;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	//add businessLogic for user validation
	public String validateUser() throws SQLException {
		System.out.println("In VoterBeans : validateUser() : " + email + ", " + password);
		
		//JB : DAO's method for user authentication
		userDetails = voterDao.validateVoter(email, password);
		
		if(userDetails == null) {
			message = "Invalid Login! Please, try again!";
			return "login";		//name of JSP for login form
		}
		
		//login success
		if(userDetails.getRole().equals("admin")) {
			System.out.println("Admin Logged In!");
			message = "Admin Logged In successfully!";
			return "admin";		//name of JSP for admin
		}
		
		message = "Voter Logged In Successfully!";
		//if voter : check status
		if(userDetails.getStatus() == 1)	//already voted
			return "voterStatus";
		return "candidateList";		//not yet voted
	}
}
