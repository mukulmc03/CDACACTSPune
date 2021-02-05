package tester;
import static utils.HibernateUtils.getSf;
import org.hibernate.*;

//import static utils.HibernateUtils.getSf;
//import org.hibernate.*;
public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(SessionFactory factory = getSf()){
			System.out.println("Hiberate Is Running Properly.."+factory);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
