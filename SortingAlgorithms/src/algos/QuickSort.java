package algos;

public class QuickSort {

	public static int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int j = start;
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			// for understanding use this
			for (int k = start; k <= end; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
//		System.out.println(j+" "+arr[j]);
		// to change the postion of pivot element
		int temp = arr[j];
		arr[j] = arr[end];
		arr[end] = temp;
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print(j);
		System.out.println();
		return j;
	}

	public static void Quicksort(int arr[], int start, int end) {
		if (start < end) {
			int pivot = partition(arr, start, end);
			// pivot-1 and pivot+1 is used to represent before pivot and after pivot
			Quicksort(arr, start, pivot - 1);
			Quicksort(arr, pivot + 1, end);

		}

	}

	public static void main(String[] args) {
		int arr[] = { 7, 2, 1, 6, 8, 5, 3, 4 };
		Quicksort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
