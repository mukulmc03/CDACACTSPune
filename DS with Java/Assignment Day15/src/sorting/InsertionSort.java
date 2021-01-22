package sorting;

public class InsertionSort {
	int arr[], temp, j;
	
	public void insertionSort(int arr[]) {
		for(int i = 1; i < arr.length; i ++) {
			temp = arr[i];
			j = i - 1;

			while(j >= 0 && temp <= arr[j]) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
		
		for(int i : arr)
			System.out.print(i + ", ");
	}
}
