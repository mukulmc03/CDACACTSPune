package dao;

import java.sql.SQLException; 

import pojos.Voter;

public interface IVoterDao {
	Voter validateVoter(String email, String password) throws SQLException;
	String updateVotingStatus(int voterID) throws SQLException;
}
