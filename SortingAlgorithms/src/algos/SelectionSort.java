package algos;

/*arr[] = 64 25 12 22 11

Find the minimum element in arr[0...4]
and place it at beginning
11 25 12 22 64

Find the minimum element in arr[1...4]
and place it at beginning of arr[1...4]
11 12 25 22 64

Find the minimum element in arr[2...4]
and place it at beginning of arr[2...4]
11 12 22 25 64

Find the minimum element in arr[3...4]
and place it at beginning of arr[3...4]
11 12 22 25 64 */

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {9,9,8,7,6,5,4,3,2};
		int n=arr.length,j=0;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
					
				}
				
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			
						
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
