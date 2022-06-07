package Neha;

	
	// Helper class
	class Helper {
	 
	    // Method 1
	    // Multiplication of 2 numbers
	    static int Multiply(int a, int b)
	    {
	 
	        // Return product
	        return a * b;
	    }
	 
	    // Method 2
	    // // Multiplication of 3 numbers
	    static int Multiply(int a, int b, int c)
	    {
	 
	        // Return product
	        return a * b * c;
	    }
	}
	 
	// Class 2
	// Main class
	public class Polymorphism {
	 
	    // Main driver method
	    public static void main(String[] args)
	    {
	 
	        // Calling method by passing
	        // input as in arguments
	        System.out.println(Helper.Multiply(6, 5));
	        System.out.println(Helper.Multiply(2, 7, 3));
	    }
	}


