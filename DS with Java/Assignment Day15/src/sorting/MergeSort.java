package sorting;

public class MergeSort {
	
	public void mergeSort(int arr[], int beginning, int end) {
		if(beginning < end) {
			int middle = (beginning + end) / 2;
			mergeSort(arr, beginning, middle);
			mergeSort(arr, middle + 1, end);
			merge(arr, beginning, middle, end);
		}
	}
	
	private void merge(int arr[], int beginning, int middle, int end) {
		int left = middle - beginning + 1;
		int right = end - middle;
		
		int leftArray[] = new int[left];
		int rightAray[] = new int[right];
		
		for(int i = 0; i < left; i ++)
			leftArray[i] = arr[beginning + i];
		
		for(int j = 0; j < right; j ++)
			rightAray[j] = arr[middle + 1 + j];
		
		int i = 0, j = 0, k = beginning;
		
		while(i < left && j < right) {
			if(leftArray[i] <= rightAray[j]) {
				arr[k] = leftArray[i];
				i ++;
			}
			else {
				arr[k] = rightAray[j];
				j ++;
			}
			k ++;
		}
		
		while(i < left) {
			arr[k] = leftArray[i];
			i ++;
			k ++;
		}
		
		while(j < right) {
			arr[k] = rightAray[j];
			j ++;
			k ++;
		}
	}
	
	public void printArray(int arr[]) {
		System.out.println("Sorted Array : ");
		for(int l : arr)
			System.out.print(l + ", ");
	}
}
