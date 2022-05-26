package Neha;

public class ObjectExample {

		int id;
		String name;
		String dept="IT";
		
		public static void main (String[] args) {
			ObjectExample obj=new ObjectExample();
			obj.id=100;
			obj.name="Neha";
			System.out.println(obj.id);
			System.out.println(obj.name);
			System.out.println(obj.dept);
	}

}
