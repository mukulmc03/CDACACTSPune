package sorting;

public class SelectionSort {
	int arr[], pos;
	
	public void selectionSort(int arr[]) {
		for(int i = 0 ; i < arr.length; i ++) {
			pos = smallest(arr, arr.length, i);
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		
		System.out.println("Sorted Array : ");
		for(int j : arr)
			System.out.print(j + ", ");
	}

	private int smallest(int[] arr, int length, int i) {
		int pos;
		int small = arr[i];
		pos = i;
		
		for(int j = i + 1; j < arr.length; j ++) {
			if(arr[j] < small) {
				small = arr[j];
				pos = j;
			}
		}
		return pos;
	}
}
