package sorting;

public class QuickSort {
	public void quickSort(int arr[], int beginning, int end) {
		int location;
		if(beginning < end) {
			location = partition(arr, beginning, end);
			quickSort(arr, beginning, location - 1);
			quickSort(arr, location + 1, end);
		}
	}

	private int partition(int[] arr, int beginning, int end) {
		int left, right, location, flag = 0;
		location = left = beginning;
		right = end;
		
		while(flag != 1) {
			while(arr[location] <= arr[right] && (location != right))
				right --;
			
			if(location == right)
				flag = 1;
			
			else if(arr[location] > arr[right]) {
				arr[location] = arr[location] + arr[right];
				arr[right] = arr[location] - arr[right];
				arr[location] = arr[location] - arr[right];
				location = right;
			}
			
			if(flag != 1) {
				while(arr[location] >= arr[left] && (location != left))
					left ++;
				
				if(location == left)
					flag = 1;
				
				else if(arr[location] < arr[left]) {
					arr[location] = arr[location] + arr[left];
					arr[left] = arr[location] - arr[left];
					arr[location] = arr[location] - arr[left];
					location = left;
				}
			}
		}
		
		return location;
	}
	
	public void printArray(int arr[]) {
		for(int i : arr)
			System.out.print(i + ", ");
	}
}
