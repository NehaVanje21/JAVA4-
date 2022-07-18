package Neha;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = new String ("Neha");
		StringBuilder s = new StringBuilder("Neha");// creating object of StringBuilder class
		
		s.append("Anudip Foundation");//changes string s
		System.out.println(s);//Mamtaa Anudip Foundation
		
		s.insert(0,"Vanje"); // inserts string at given position
		
		s.replace(0, 3, "Run");// replace string from start to end position
		
		s.delete(0, 3);// delete string from start to end position
		
		s.reverse();
		 System.out.println(s);
		
		
	}

}
