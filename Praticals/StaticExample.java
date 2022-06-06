package Neha;

public class StaticExample {
	
		//instance variable
		int empId;
		String empName;
		//static variable
		static String empOffLocation="Pune";
		
		//Parameterized constructor
			public StaticExample(int i,String n) {
				this.empId=i;
				this.empName=n;
			}
			
		
		//method to display values
		void display() {
			System.out.println(empId + " " + empName + " " + empOffLocation);
		}

		public static void main(String[] args) {
			StaticExample s= new StaticExample(110,"Pallavi");
			StaticExample s1= new StaticExample(111,"Mayuri");
			
	        s.display();
	        s1.display();
		}

	}

