
public class peakNumber {
	/*
	 * Given an array A of N integers. The task is to find a peak element in A in O(
	 * log N ) . An array element is peak if it is not smaller than its neighbours.
	 * For corner elements, consider only one neighbour.
	 */
	public static int search(int arr[],int start,int end)
	{
	    if(start==end)
	        {
	            return start;
	        }
	        int mid=(start+end)/2;
	        if(arr[mid-1]<=arr[mid]&&arr[mid+1]<=arr[mid])
	        {
	            return mid;
	        }
	        
	        if(arr[mid-1]<=arr[mid])
	        {
	            return search(arr,mid+1,end);
	        }
	        else
	        {
	            return search(arr,start,mid-1);
	        }
	    
	  }
	public static int peakElement(int[] a,int n)
    {
       
       
       if(n==1)
       {
           return 0;
       }
       if(a[0]>a[1])
       {
       return 0;
       }
       if(a[n-1]>a[n-2])
       {
       return n-1;
       }
       
       
       int ans=search(a,1,n-2);
       return ans;
       
    }
	public static void main(String[] args) {
		int arr[]={1,2,3};
		System.out.println(peakElement(arr,arr.length-1));
	}

}
