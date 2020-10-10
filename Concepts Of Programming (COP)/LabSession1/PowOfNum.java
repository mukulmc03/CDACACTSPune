//Calculate power of a number

package eDACAssignments;

public class PowOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5, p = 2;
	    long result = 1;
	        
	    int i=p;
	    while (i != 0)
	    {
	    	result *= number;
	        --i;
	    }
	    System.out.println(number+"^"+p+" = "+result);
	}

}
