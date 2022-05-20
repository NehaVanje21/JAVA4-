package Neha;

public class Ifthenelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int examScore = 79; 
			char grade;
			
			if (examScore >= 90) {
				grade = 'A';
			}
			else if (examScore >= 80) {
				grade = 'B';
			}
			else if (examScore >= 70) {
				grade = 'C';
			}
			else if (examScore >= 60) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			System.out.println("The grade is" + grade);

	}

}
