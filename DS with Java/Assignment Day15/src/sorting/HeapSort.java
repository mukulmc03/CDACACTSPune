package sorting;

public class HeapSort {
	public void heapSort(int arr[], int size) {
		for(int i = size / 2 - 1; i >= 0; i --)
			createHeap(arr, size, i);
		
		for(int i = size - 1; i >= 0; i --) {
			arr[0] = arr[0] + arr[i];
			arr[0] = arr[0] - arr[i];
			arr[i] = arr[0] - arr[i];
			
			createHeap(arr, i, 0);
		}
	}

	private void createHeap(int[] arr, int size, int i) {
		int largest = i, left = 2 * i + 1, right = 2 * i + 2; 
		if(left < size && arr[left] > arr[largest])
			largest = left;
		if (right < size && arr[right] > arr[largest])  
			largest = right;  
			  
		if (largest != i) {  
			arr[i] = arr[i] + arr[largest];
			arr[i] = arr[i] - arr[largest];
			arr[largest] = arr[i] - arr[largest];
				
			createHeap(arr, size, largest);
		}
	}

	public void printArray(int[] arr) {
		for(int i : arr)
			System.out.print(i + ", ");
	}
}
