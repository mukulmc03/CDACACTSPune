package sorting;

public class BubbleSort {
	int arr[];
	
	public void bubbleSort(int[] arr) {
		System.out.println("Sorted Array : ");
		for(int i = 0; i < arr.length; i ++) {
			for(int j = i + 1 ; j < arr.length; j ++) {
				if(arr[i] > arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
			System.out.print(arr[i] + ", ");
		}
	}
}
