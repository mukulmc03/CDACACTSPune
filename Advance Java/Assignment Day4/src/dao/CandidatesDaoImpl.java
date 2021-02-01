package dao;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import pojos.Candidate;

import static utils.DBUtils.fetchDBconnection;

public class CandidatesDaoImpl implements ICandidatesDao {
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3, pst4;
	
	public CandidatesDaoImpl() throws ClassNotFoundException, SQLException {
		cn = fetchDBconnection();
		
		pst1 = cn.prepareStatement("select * from candidates");
		pst2 = cn.prepareStatement("update candidates set votes = votes + 1 where id = ?");
		pst3 = cn.prepareStatement("select * from candidates order by votes desc limit 2");
		pst4 = cn.prepareStatement("select party, votes from candidates order by votes desc");
		
		System.out.println("Candidate DAO created!");
	}
	
	public ArrayList<Candidate> getCandidateList() throws SQLException {
		ArrayList<Candidate> candidateList = new ArrayList<Candidate>();
		try(ResultSet rst = pst1.executeQuery()){
			while(rst.next())
				candidateList.add(new Candidate(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4)));
		}
		return candidateList;
	}
	
	@Override
	public String incrementVotes(int candidateID) throws SQLException {
		pst2.setInt(1, candidateID);
		
		if(pst2.executeUpdate() > 0)
			return "Candidates Votes updated";
		else
			return "Candidates Votes not updated";
	}
	
	@Override
	public ArrayList<Candidate> getTopTwoCandidates() throws SQLException {
		ArrayList<Candidate> topCandidatesList = new ArrayList<Candidate>();
		try(ResultSet rst = pst3.executeQuery()){
			while(rst.next())
				topCandidatesList.add(new Candidate(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4)));
		}
		return topCandidatesList;
	}

	@Override
	public HashMap<String, Candidate> partyWiseAnalysis() throws SQLException {
		HashMap<String, Candidate> partyMap = new HashMap<String, Candidate>();
		try(ResultSet rst = pst4.executeQuery()){
			while(rst.next())
				partyMap.put(rst.getString(1), new Candidate(rst.getString(1), rst.getInt(2)));
		}
		return partyMap;
	}

	public void cleanUp() throws SQLException {
		if(pst1 != null)
			pst1.close();
		if(pst2 != null)
			pst2.close();
		if(pst3 != null)
			pst3.close();
		if(pst4 != null)
			pst4.close();
		if(cn != null)
			cn.close();
		
		System.out.println("Candidate DAO Cleaned Up!");
	}
}
