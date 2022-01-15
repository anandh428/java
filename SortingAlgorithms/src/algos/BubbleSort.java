package algos;

/*Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

Auxiliary Space: O(1)*/

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {9,9,8,7,6,5,4,3,2};
		
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			for(int k=0;k<n;k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
//		
		/*
		 * Algorithm To sort an array of size n in ascending order: 1: Iterate from
		 * arr[1] to arr[n] over the array. 2: Compare the current element (key) to its
		 * predecessor. 3: If the key element is smaller than its predecessor, compare
		 * it to the elements before. Move the greater elements one position up to make
		 * space for the swapped element.
		 * 
		 */
	}

}
