package Neha;

public class ArrayExDEg
{
	
public static void main(String[] args) 
{
	//Declaring and initializing 2D array
	int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};  //3*3 matrix
	
	
	//printing 2d array
	for(int i=0;i<3;i++)  //fetch row
	{ 
		for(int j=0;j<3;j++)
		{  //fetch col
			System.out.print(arr[i][j]);
		}
		System.out.println();
		
	}
}
}
			
