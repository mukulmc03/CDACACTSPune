package beans;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import dao.CandidatesDaoImpl;
import pojos.Candidate;

public class CandidateBeans {
	private String name, party, dob;
	
	//manages candidateDao
	private CandidatesDaoImpl candidateDao;
	private String message;
	
	//to store authenticated candidates details
	private Candidate candidateDetails;
	
	public CandidateBeans() throws ClassNotFoundException, SQLException {
		candidateDao = new CandidatesDaoImpl();
		System.out.println("CandidateBean created!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CandidatesDaoImpl getCandidateDao() {
		return candidateDao;
	}

	public void setCandidateDao(CandidatesDaoImpl candidateDao) {
		this.candidateDao = candidateDao;
	}
	
	public Candidate getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(Candidate candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	//add BL to for candidate Validation
	public String validateCandidate() throws SQLException {
		System.out.println("In CandidateBeans validateCandidate() : " + name + ", " + party + ", " + dob);
		
		LocalDate birthDate = LocalDate.parse(dob);
		Period period = Period.between(birthDate, LocalDate.now());
		
		if(period.getYears() > 35 ) {
			message = candidateDao.registerCandidate(new Candidate(name, party));
			System.out.println("Candidate Reg. Success!");
			return "admin";
		}
		
		System.out.println("Candidate Reg. Failed!");
		message = "Candidate Not Eligible (Age)!";
		return "candidateRegistration";
	}
}
