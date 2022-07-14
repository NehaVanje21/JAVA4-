package Neha;

public interface LibraryUser {

		void registerAccount();
		void requestBook();
	}

	class KidUser implements LibraryUser {
		private int age;
		private String bookType;
		
		public void setAge(int age) {
			// TODO Auto-generated method stub
			this.age = age;
		}
		public void setBookType(String book) {
			// TODO Auto-generated method stub
			this.bookType = book;
		}

		public void registerAccount() {
			// TODO Auto-generated method stub
			if(age < 12)
				System.out.println("You have successfully registered under a Kids Account");
			else
				System.out.println("Sorry, Age must be less than 12 to register as a kid");		
		}

		public void requestBook() {
			// TODO Auto-generated method stub
			if(bookType.equals("Kids"))
				System.out.println("Book Issued successfully, please return the book within 10 days");
			else
				System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}

	class AdultUser implements LibraryUser {
		private int age;
		private String bookType;
		
		public void setAge(int age) {
			// TODO Auto-generated method stub
			this.age = age;
		}
		public void setBookType(String book) {
			// TODO Auto-generated method stub
			this.bookType = book;
		}
		
		public void registerAccount() {
			// TODO Auto-generated method stub
			if(age > 12)
				System.out.println("You have successfully registered under a Adult Account");
			else
				System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
		public void requestBook() {
			// TODO Auto-generated method stub
			if(bookType.equals("Fiction"))
				System.out.println("Book Issued successfully, please return the book within 7 days");
			else
				System.out.println("Oops, you are allowed to take only adult Fiction books");
		}

	}
	
	public class LibraryUserDemo {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			KidUser kidUsers = new KidUser();
			kidUsers.setAge(11);
			kidUsers.setBookType("Kids");
			kidUsers.registerAccount();
			kidUsers.requestBook();
			kidUsers.setAge(13);	
			kidUsers.setBookType("Fiction");		
			kidUsers.registerAccount();
			kidUsers.requestBook();
			System.out.println();
			
			AdultUser adultUser = new AdultUser();
			adultUser.setAge(7);
			adultUser.setBookType("Kids");
			adultUser.registerAccount();
			adultUser.requestBook();
			adultUser.setAge(65);	
			adultUser.setBookType("Fiction");		
			adultUser.registerAccount();
			adultUser.requestBook();
			
		}

	}






