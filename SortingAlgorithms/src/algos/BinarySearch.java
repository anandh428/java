
package algos;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		int ans=binarySearch(arr,0,arr.length-1,8);
		System.out.println(ans);
		
	}

	public static int binarySearch(int[] arr, int start, int end,int num) 
	{
//		int ans=-1;
		//start < end in merge sort but in this case = also because if it is to find 8 then we should include =
        if(start<=end)
        {
        	
        	int mid=(start+end)/2;
//        	System.out.println(arr[mid]);
        	if(arr[mid]==num)
        	{
//        		System.out.println("t");
        		return mid;
        	}
        	else if(arr[mid]<num)
        	{
        		return binarySearch(arr,mid+1,end,num);
        	}
        	else if(arr[mid]>num)
        	{
        		return binarySearch(arr,start,mid-1,num);
        	}
        	
        	
        }
	   return -1;
		
		
        }
	}


