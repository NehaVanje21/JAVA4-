package Neha;

public class ArrayEx {
	 
	public static void main(String[] args)
	{
		//datatype arrayname=new datatype size
		int arr[]=new int[10];      //declaration and instantiation
		

		arr[0]=100;   //initialization
		arr[1]=102;
		arr[2]=103;
		arr[3]=104;
		arr[4]=105;
		arr[5]=106;
		arr[6]=107;
		arr[7]=108;
		arr[8]=109;
		arr[9]=110;
		//arr[10]=111:   //inserting element outside the bound
		
		//traversing array
		for(int i=0;i<arr.length;i++)  //length is property of array
		{
			System.out.print("Array value are : "+ arr[i]+"");
			
			
		}
		System.out.println();
		System.out.println("Array Value are:"+ arr[6]+" ");
		System.out.println(arr.length);
		
	}

}
