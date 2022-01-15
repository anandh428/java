
public class countZeros {
	
	
	
	
	
	
	
	public static int binarySearch(int arr[],int start,int end)
    {
        
        if(start<=end)
        {
        int mid=(start+end)/2;
        if((mid==0||arr[mid-1]==1)&&arr[mid]==0)
        {
            return mid;
        }
        if(arr[mid]==1)
        {
            return binarySearch(arr,mid+1,end);
            
        }
        else
        {
            return binarySearch(arr,start,mid-1);
        }
        }
        return -1;
    
    }
    
    
    
    int countZeroes(int[] arr, int n) {
        
        if(arr[0]==0)
        {
            return n;
        }
        if(arr[n-1]==1)
        {
            return 0;
        }
        
        
       int ans=binarySearch(arr,0,n-1);
        // System.out.println(ans);
       int s=(n-(ans));
    //   System.out.println(s);
       return s;
       
       
        
        
        
    }

	public static void main(String[] args) {
		
		int arr[]= {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
		int n=arr.length;
		
	 int ans=n-binarySearch(arr,0,n-1);
	 System.out.println(ans);
		
	}

}
