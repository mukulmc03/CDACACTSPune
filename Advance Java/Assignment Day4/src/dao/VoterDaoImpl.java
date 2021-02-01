package dao;

import java.sql.*; 

import static utils.DBUtils.fetchDBconnection;

import pojos.Voter;

public class VoterDaoImpl implements IVoterDao {
	private Connection cn;
	private PreparedStatement pst1, pst2;
	
	public VoterDaoImpl() throws ClassNotFoundException, SQLException {
		cn = fetchDBconnection();
		
		pst1 = cn.prepareStatement("select * from voters where email = ? and password = ?");
		pst2 = cn.prepareStatement("update voters set status = 1 where id = ?");
		
		System.out.println("Voter Dao Created!");
	}
	
	@Override
	public Voter validateVoter(String email, String password) throws SQLException {
		pst1.setString(1, email);
		pst1.setString(2, password);
		
		try(ResultSet rst = pst1.executeQuery()){
			if(rst.next())
				return new Voter(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5), rst.getString(6));
		return null;
		}
		
		
	}

	@Override
	public String updateVotingStatus(int voterID) throws SQLException {
		pst2.setInt(1, voterID);
		
		if(pst2.executeUpdate() == 1)
			return "Voting Status updated Successfully!";
		return "Invalid Voter ID";
	}
	
	public void cleanUp() throws SQLException {
		if(pst1 != null)
			pst1.close();
		if(pst2 != null)
			pst2.close();
		if(cn != null)
			cn.close();
		
		System.out.println("Voter DAO Cleaned Up!");
	}
}
