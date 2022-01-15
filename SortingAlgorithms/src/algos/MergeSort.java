package algos;

public class MergeSort {
	
	
	public static void merge(int arr[],int start,int mid,int end)
	{
		
		int L[]=new int[mid-start+1];
		int R[]=new int[end-mid];
		System.out.println();
		System.out.println(start+" s "+mid+" m "+end+" e");
		for(int i=0;i<L.length;i++)
		{
			L[i]=arr[start+i];
		}
		for(int i=0;i<R.length;i++)
		{
			R[i]=arr[mid+1+i];
		}
//		System.out.println(start);
		int i=0,j=0,k=start;
		while(i<L.length&&j<R.length)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
				k++;
			}
			else if(L[i]>R[j])
			{
				arr[k]=R[j];
				j++;
				k++;
			}
			
			
		}
		while(i<L.length)
		{
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<R.length)
		{
			arr[k]=R[j];
			j++;
			k++;
		}
		
		for(int h=0;h<arr.length;h++)
		{
			System.out.print(arr[h]+" ");
		}
		
	}
	
	public static void sort(int arr[],int start,int end)
	{
	   if(start<end)
	   {
		   int mid=(start+end)/2;
		   sort(arr,start,mid);
		   sort(arr,mid+1,end);
		   merge(arr,start,mid,end);
	   }
	}
	public static void main(String[] args) {
		int arr[]= {38,27,43,3,9,82,10};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
