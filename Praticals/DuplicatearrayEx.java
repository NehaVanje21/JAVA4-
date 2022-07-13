package Neha;

public class DuplicatearrayEx
{
	//method to find duplicate in array
	public static void  calculateduplicate()
	
	{
		//initialize array
		int[] arr = new int [] {1,3,4,9,5,7,7,8,9,8};
		
		System.out.println("duplicate value");
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
				
			}
				
			}
		}

	public static void main(String[] args)
	
	{
		calculateduplicate(); //invoke method
	}
}



