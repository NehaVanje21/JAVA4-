package Neha;

public class EvenNumber {
	    // function to find sum of
	    // first n even numbers
	    static int evenSum(int n)
	    {
	        // required sum
	        return (n * (n + 1));
	    }
	     
	    // driver function
	    public static void main(String argc[])
	    {
	        int n = 40;
	        System.out.println("Sum of first " + n +
	                          " Even numbers is: " +
	                            evenSum(n));
	    }
	}
	 


