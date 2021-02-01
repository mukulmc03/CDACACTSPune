package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pojos.Candidate;

import static utils.DBUtils.fetchDBconnection;

public class CandidatesDaoImpl implements ICandidatesDao {
	private Connection cn;
	private PreparedStatement pst1;
	
	public CandidatesDaoImpl() throws ClassNotFoundException, SQLException {
		cn = fetchDBconnection();
		
		pst1 = cn.prepareStatement("select * from candidates");
	}
	
	public ArrayList<Candidate> getCandidateList() throws SQLException {
		ArrayList<Candidate> candidateList = new ArrayList<Candidate>();
		try(ResultSet rst = pst1.executeQuery()){
			while(rst.next())
				candidateList.add(new Candidate(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4)));
		}
		return candidateList;
	}
	
	public void cleanUp() throws SQLException {
		if(pst1 != null)
			pst1.close();
		if(cn != null)
			cn.close();
		
		System.out.println("Candidate DAO Cleaned Up!");
	}
}
