package Neha;

public class ExceptionHandling {
	public void calculatePerUnit() {
		int qty =0 , rate = 10000 , punit = 0;
		try {
			punit = rate/qty;  //may exception arise
		}
		catch(Exception e) {
		//	System.out.println("Product quantity cannot be zero...");
			System.out.println(e);
			
		}
		System.out.println("Per unit price be : " + punit);
		
	}

	public static void main(String[] args) {
		
		ExceptionHandling obj = new ExceptionHandling();
		obj.calculatePerUnit();

	}

}

