package Neha;

public class SecondLargestArrayEx {
	
	static int calculateSecondLargest(int arr[], int lenggth) {
		int temp;
		
		//sort ascending 
		for(int i=0;i<lenggth;i++) {
			for(int j=i+1;j<lenggth;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		return arr[lenggth-2]; //calculate Second Largest
	}

	public static void main(String[] args) {
		
		//initialize array
		int [] arr = new int [] {1,7,4,8,2,3,9};
		
		System.out.println("Second Largest : " + calculateSecondLargest(arr,7));
	}
}