package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import pojos.Candidate;

public interface ICandidatesDao {
	ArrayList<Candidate> getCandidateList() throws SQLException; 
}
