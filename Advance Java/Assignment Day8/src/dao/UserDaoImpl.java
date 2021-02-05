package dao;

import pojos.User;
import static utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDaoImpl {
	
	public String registerUser(User user) {
		String mesg = "user reg failled";
		Session session = getSf().openSession();    //L1 cache is created/opened:EMPTY              // always take from ORG.HIBERNATE
		
		//begin transaction
		Transaction tx = session.beginTransaction();  //DB connection pulled out and attahed to the hibernate session
		System.out.println("is open "+session.isOpen()+" is Connected "+session.isConnected());   // true ------ true
		try{
			Integer id = (Integer)session.save(user);
			mesg ="user reg seccessfully with ID "+id;
			tx.commit();   // is there is no error then commit otherwise rollBack
		}catch (RuntimeException e) {	// as we will get RuntimeExcepion only
			// if there is an error then roll back the exception to the caller
			tx.rollback();
			throw e;
		} finally {
			if(session != null)
				session.close();
		}
		System.out.println("is open "+session.isOpen()+" is Connected "+session.isConnected());   // false ------ fasle
		return mesg;
	}
	
}




// heart of hibernate is Session interface from hibrnate api
// main runtime interface between java app and hibernet
// so get Session  ------ beg transaction -----if no errors the commit transaction---- if error is there then roll back ---- and close that session so it will go to pool
// session will be 1 per req... thread sevecing client req