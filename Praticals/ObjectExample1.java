package Neha;

public class ObjectExample1 {

	public static void main(String[] args) {
		int emp_id;
		String emp_name;
		double emp_sal;
		long emp_ph;
		
		void show() {
			System.out.println("Employee details are");
			
		}
		void display(int i,String n,double s,long p) {
			emp_id=i;
			emp_name=n;
			emp_sal=s;
			emp_ph=p;
			System.out.println(emp_id+" "+emp_name+" "+emp_sal+" "+emp_ph);
			
		}

		

	}
	public class MethodExample{
		public static void main(String[] args) {
			Employee e = new Employee();
			Employee e1 = new Employee();
			Employee e2 = new Employee();
			e.show();
			e.display(101,"Neha",25000.56,708343497);
			e1.display(102,"Mayuri",26000.78,982340299);
			e2.display(103,"pallavi",24000.98,912346576);
			}
	}
	}


