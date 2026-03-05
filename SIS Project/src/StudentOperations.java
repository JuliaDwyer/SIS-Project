import java.util.Scanner;

public class StudentOperations
	{
		public static void addStudent()
			{
				Scanner stringInputs = new Scanner(System.in);
				String input;
				String addedStudent = "";
				String [] dataSplit = new String [8];
				System.out.println("I'm going to ask you a series of parameters.");
				System.out.println("Type in the parameters carefully");
				
				System.out.println("Type in the first name: ");
				input = stringInputs.nextLine();
				dataSplit[0] = input;
				
				System.out.println("Type in the last name: ");
				input = stringInputs.nextLine();
				dataSplit[1] = input;
				
				System.out.println("Type in the first class: ");
				input = stringInputs.nextLine();
				dataSplit[2] = input;
				
				System.out.println("Type in the first class's grade: ");
				input = stringInputs.nextLine();
				dataSplit[3] = input;
				
				System.out.println("Type in the second class: ");
				input = stringInputs.nextLine();
				dataSplit[4] = input;
				
				System.out.println("Type in the second class's grade: ");
				input = stringInputs.nextLine();
				dataSplit[5] = input;
				
				System.out.println("Type in the third class: ");
				input = stringInputs.nextLine();
				dataSplit[6] = input;
				
				System.out.println("Type in the third class's grade: ");
				input = stringInputs.nextLine().toUpperCase();
				dataSplit[7] = input;
				
				
				
				readTextFile.students.add(new Student(dataSplit[0], dataSplit[1] , readTextFile.gpaCalculator(dataSplit) , dataSplit[2] , dataSplit[3] , dataSplit[4] , dataSplit[5] , dataSplit[6] , dataSplit[7]));;
				
			}

		public static void removeStudent()
			{
				Scanner intInputs = new Scanner(System.in);
				System.out.println("You have selected to remove student");
				printStudents();
				boolean wantsToRemove = false;
				int index = 0;
				int check;
				while (wantsToRemove = false)
					{
						System.out.println("Type the index of student you want to remove: ");
						index = intInputs.nextInt();
						System.out.println("Are you sure you want to remove <" + readTextFile.students.get(index).getLastName() + ", " + readTextFile.students.get(index).getFirstName() + ">?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						check = intInputs.nextInt();
						if (check == 1)
							{
								wantsToRemove = true;
							}
						else if (check == 2)
							{
								wantsToRemove = false;
							}
						else
							{
								removeStudent();
							}
						
					}
				readTextFile.students.remove(index);
				
			}

		public static void printStudents()
			{
				for (int i = 0; i < readTextFile.students.size(); i++)
					{
						System.out.println((i+1) + ") " + readTextFile.students.get(i).getLastName() + ", " + readTextFile.students.get(i).getFirstName());
					}
			}
	}
