import java.util.Scanner;
public class playerMenus
	{
	public static void main(String[] args) {
		Menus();
	
	}
	
		static Scanner userIntInput = new Scanner(System.in);
	
		 public static void Menus()
	
		 {
			 System.out.println("Welcome!");
			 System.out.println("What would you like to do?");
			 System.out.println("1. Add or delete a student");
			 System.out.println("2. Change student grades/schedule");
			 System.out.println("3. Sort students");
			 int choice = userIntInput.nextInt();
			 
			 if(choice == 1){
				 System.out.println("1. Add student");
				 System.out.println("2. Delete student");
	         }else if(choice == 2) {
	        	 System.out.println("1. Change student grades");
	        	 System.out.println("2. Change student schedule");
	         }else if(choice == 3) {
	        	 System.out.println("1. Sort by last name");
	        	 System.out.println("2. Sort by GPA");
	        	 System.out.println("3. Sort by period");
	        	 // link to other classes??
	         }
		 
		 }
	}
	
