import java.io.File;
import java.io.IOException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class readTextFile 
	{
		static ArrayList<Student> students = new ArrayList<Student>();	
		
		
		public static void readTextFile() throws IOException
		{
			
			String fileName = "StudentInfo.txt";
			Scanner fileReader = new Scanner(new File("StudentInfo.txt"));
			while (fileReader.hasNextLine()) 
				{
					String data = fileReader.nextLine();
					String[] dataSplit = data.split(" ");
					students.add(new Student(dataSplit[0], dataSplit[1] , gpaCalculator(dataSplit) , dataSplit[2] , dataSplit[3] , dataSplit[4] , dataSplit[5] , dataSplit[6] , dataSplit[7]));
				}
			
		}
		
		
		public static double gpaCalculator (String[] dataSplit)
			{
				double gpa1 = 0;
				double gpa2 = 0;
				double gpa3 = 0;
			
				switch (dataSplit[3])
				{
					case "A+": 
						{
							gpa1 = 4.3;
							break;
						}
						
					case "A": 
						{
							gpa1 = 4.0;
							break;
						}
						
					case "A-": 
						{
							gpa1 = 3.7;
							break;
						}
						
					case "B+": 
						{
							gpa1 = 3.3;
							break;
						}
					
					case "B": 
						{
							gpa1 = 3.0;
							break;
						}
					
					case "B-": 
						{
							gpa1 = 2.7;
							break;
						}
						 
					case "C+": 
						{
							gpa1 = 2.3;
							break;
						}
					
					case "C": 
						{
							gpa1 = 2.0;
							break;		
						}
						
					case "C-": 
						{
							gpa1 = 1.7;
							break;
						}
						
					case "D+": 
						{
							gpa1 = 1.3;
							break;
						}
						
					case "D": 
						{
							gpa1 = 1.0;
							break;
						}
						
					case "D-": 
						{
							gpa1 = 0.7;
							break;	
						}
						
					case "F": 
						{
							gpa1 = 0.0;
							break;
						}
						
					default:	
				}
				
				switch (dataSplit[5])
				{
					case "A+": 
							{
								gpa2 = 4.3;
								break;
							}
							
						case "A": 
							{
								gpa2 = 4.0;
								break;
							}
							
						case "A-": 
							{
								gpa2 = 3.7;
								break;
							}
							
						case "B+": 
							{
								gpa2 = 3.3;
								break;
							}
						
						case "B": 
							{
								gpa2 = 3.0;
								break;
							}
						
						case "B-": 
							{
								gpa2 = 2.7;
								break;
							}
							 
						case "C+": 
							{
								gpa2 = 2.3;
								break;
							}
						
						case "C": 
							{
								gpa2 = 2.0;
								break;		
							}
							
						case "C-": 
							{
								gpa2 = 1.7;
								break;
							}
							
						case "D+": 
							{
								gpa2 = 1.3;
								break;
							}
							
						case "D": 
							{
								gpa2 = 1.0;
								break;
							}
							
						case "D-": 
							{
								gpa2 = 0.7;
								break;	
							}
							
						case "F": 
							{
								gpa2 = 0.0;
								break;
							}
					default:	
				}
				
				switch (dataSplit[7])
				{
					case "A+": 
							{
								gpa3 = 4.3;
								break;
							}
							
						case "A": 
							{
								gpa3 = 4.0;
								break;
							}
							
						case "A-": 
							{
								gpa3 = 3.7;
								break;
							}
							
						case "B+": 
							{
								gpa3 = 3.3;
								break;
							}
						
						case "B": 
							{
								gpa3 = 3.0;
								break;
							}
						
						case "B-": 
							{
								gpa3 = 2.7;
								break;
							}
							 
						case "C+": 
							{
								gpa3 = 2.3;
								break;
							}
						
						case "C": 
							{
								gpa3 = 2.0;
								break;		
							}
							
						case "C-": 
							{
								gpa3 = 1.7;
								break;
							}
							
						case "D+": 
							{
								gpa3 = 1.3;
								break;
							}
							
						case "D": 
							{
								gpa3 = 1.0;
								break;
							}
							
						case "D-": 
							{
								gpa3 = 0.7;
								break;	
							}
							
						case "F": 
							{
								gpa3 = 0.0;
								break;
							}
						
					default:	
				}
				
				double gpa = (gpa1 + gpa2 + gpa3)/(3);
				
				return gpa;
			}
		
		
	
		
	}
