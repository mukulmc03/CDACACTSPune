package dao;

import java.sql.SQLException;  
import java.util.ArrayList;
import java.util.HashMap;

import pojos.Candidate;

public interface ICandidatesDao {
	ArrayList<Candidate> getCandidateList() throws SQLException; 
	String incrementVotes(int candidateID) throws SQLException;
	ArrayList<Candidate> getTopTwoCandidates() throws SQLException;
	HashMap<String, Candidate> partyWiseAnalysis() throws SQLException;
	String registerCandidate(Candidate candidate) throws SQLException;
}
