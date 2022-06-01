package Neha;

public class object {
	
		
		int id;
		String name;
		String dept="CS";

		public static void main(String[] args) {
			
			object obj = new object();
			object obj1 = new object();
			
			obj.id=110;
			obj.name="Mayuri";
			
			obj1.id=112;
			obj1.name="Neha";
			
			System.out.println(obj.id + " " + obj.name + " " +obj.dept);
			System.out.println(obj1.id + " " + obj1.name + " " +obj.dept);
			

		}

	}


