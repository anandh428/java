package algos;

/*Keeping the first index fixed in first attempt 
Comparing arr[i](arr[1]) and arr[j](arr[0])
Selecting a element which is temp and checking in backwaards whether there is larger element 
than the current element*/


public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {9,9,8,7,6,5,4,3,2};
		
		for(int i=1;i<arr.length;i++)
		{
			//j=0 ,i=1
			//j=1 ,i=2 so on..
			int j=i-1;
			int temp=arr[i];
			//this checking backwards  
			while(j>=0&&arr[j]>temp)//checking with the current element which is temp
			{
				arr[j+1]=arr[j];
				j--;
			}
			System.out.println(j);
			
			//this is j ends when the current element reaches a element smaller than itslef
			//so placing the current element(temp) after that
            arr[j+1]=temp;		
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
