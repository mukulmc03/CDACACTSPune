package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Candidate;
import pojos.Voter;

public interface IVoterDao {
	Voter validateVoter(String email, String password) throws SQLException;
	String updateVotingStatus(int voterID) throws SQLException;
	List<Candidate> incrementVotes(int candidateID) throws SQLException;
}
