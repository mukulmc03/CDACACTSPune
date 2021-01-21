package searching;

public class BinarySearch {  
 
	public static int binarySearch(int[] a, int beg, int end, int item)  
	{  
	    int mid;  
	    if(end >= beg)   
	    {     
	        mid = (beg + end)/2;  
	        if(a[mid] == item)  
	        {  
	            return mid+1;  
	        }  
	        else if(a[mid] < item)   
	        {  
	            return binarySearch(a,mid+1,end,item);  
	        }  
	        else   
	        {  
	            return binarySearch(a,beg,mid-1,item);  
	        }  
	      
	    }  
	    return -1;   
	}  
}
