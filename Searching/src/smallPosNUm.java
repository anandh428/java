import java.util.Arrays;

public class smallPosNUm {
	 static boolean search(int arr[],int start,int end,int n)
	    {
	        if(start<=end)
	        {
	            
	            int mid=(start+end)/2;
	            
	            if(arr[mid]==n)
	            {
	                return true;
	            }
	            
	            if(arr[mid]<n)
	            {
	                return search(arr,mid+1,end,n);
	            }
	            else
	            {
	                return search(arr,start,mid-1,n);
	            }
	        }
	        
	        return false;
	        
	        
	        
	    }
	    static int missingNumber(int arr[], int size)
	    {
	        
	        Arrays.sort(arr);
	        
	        int l=arr[size-1];
	        int ans=0;
	        int i=1;
	        while(i<=l)
	        {
	            
	            if(search(arr,0,size-1,i)==false)
	            {
	                ans=i;
	                break;        
	            }
	            i++;
	        }
	        
	        if(ans>0)
	        {
	        // System.out.println(ans);
	        return ans;
	        }
	        else
	        {
	            // System.out.println((arr[size-1]+1));
	            return (arr[size-1]+1);
	        }
	    
	        
	        
	        // Your code here
	        // You can add utility functions (if required)
	        
	    }
	    public static void main(String[] args) {
			int arr[]={0,-10,1,3,-20};
//			int arr[]={1,2,3,4,5};
			System.out.println(missingNumber(arr,arr.length-1));
	    	
		}

}
