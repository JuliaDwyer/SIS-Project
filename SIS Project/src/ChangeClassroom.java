import java.util.Scanner;
import java.util.ArrayList;

public class ChangeClassroom
	{

public static ArrayList <Student> changeGrade(ArrayList <Student> students){
			
			System.out.println("What student's grade would you like to change?");
			
			StudentOperations.printStudents();
			
			System.out.println("Enter the number.");
			
			Scanner studentSelection = new Scanner(System.in);
			int chosenStudent = studentSelection.nextInt();
			
			System.out.println("Which grade would you like to change?");
			System.out.println("1. Period 1");
			System.out.println("2. Period 2");
			System.out.println("3. Period 3");
			
			Scanner classSelection = new Scanner(System.in);
			int chosenClass = classSelection.nextInt();
			
			System.out.println("What would you like to change the grade to?");
			
			Scanner gradeSelection = new Scanner(System.in);
			String chosenGrade = gradeSelection.nextLine();
			
			switch(chosenClass) {
				case 1:
						{
							students.get(chosenStudent).setClass1Grade(chosenGrade.toUpperCase());
							break;
						}
				case 2:
						{
							students.get(chosenStudent).setClass2Grade(chosenGrade.toUpperCase());
							break;
						}
				case 3:
						{
							students.get(chosenStudent).setClass3Grade(chosenGrade.toUpperCase());
							break;
						}
						
			}
			
			return students;
		}

public static ArrayList <Student> changeSchedule(ArrayList <Student> students){
		
		System.out.println("What student's schedule would you like to change?");
		
		StudentOperations.printStudents();
		
		System.out.println("Enter the number.");
		
		Scanner studentSelection = new Scanner(System.in);
		int selectedStudent = studentSelection.nextInt();
		
		System.out.println("Which class would you like to change?");
		
		Scanner classSelection = new Scanner(System.in);
		int selectedClass = classSelection.nextInt();
		
		System.out.println("What would you like to change the class to?");
		
		Scanner classChange = new Scanner(System.in);
		String newClass = classChange.nextLine();
		
		switch(selectedClass) {
			case 1:
					{
						students.get(selectedStudent).setClass1(newClass);
						break;
					}
			case 2:
					{
						students.get(selectedStudent).setClass2(newClass);
						break;
					}
			case 3:
					{
						students.get(selectedStudent).setClass3(newClass);
						break;
					}
					
		}
		
		
		return students;
	

}
	}
