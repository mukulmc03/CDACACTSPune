package searching;

public class LinearSearch {
	int arr[];
	
	public boolean linearSearch(int[] arr, int element) {
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == element) {
				return true;
			}
		}
		return false;
	}
}
