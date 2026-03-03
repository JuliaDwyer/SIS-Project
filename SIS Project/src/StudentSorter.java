import java.util.Scanner;
public class StudentSorter
	{
		static Scanner userIntInput = new Scanner(System.in);
		public static void main(String[] args) {
			
			sortChoice();
		}
         private static void sortChoice() {
        	System.out.println("Choose sort style.");
        	int choice = userIntInput.nextInt();
        	System.out.println("1) last name");
         }
	}
