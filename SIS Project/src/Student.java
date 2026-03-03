
public class Student
	{
		
		private String firstName; // dataSplit[0]
		private String lastName; // dataSplit[1]
		private double GPA; // This is to be added later because you need the data from the .txt for this calculation
		private String class1; // dataSplit[2]
		private String class1Grade; // dataSplit[3]
		private String class2; // dataSplit[4]
		private String class2Grade; // dataSplit[5]
		private String class3; // dataSplit[6]
		private String class3Grade; // dataSplit[7]

		public Student (String firstName, String lastName, double GPA, String class1, String class1Grade, String class2, String class2Grade, String class3, String class3Grade)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.GPA = GPA;
			this.class1 = class1;
			this.class1Grade = class1Grade;
			this.class2 = class2;
			this.class2Grade = class2Grade;
			this.class3 = class3;
			this.class3Grade = class3Grade;
		}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public double getGPA()
			{
				return GPA;
			}

		public void setGPA(double gPA)
			{
				GPA = gPA;
			}

		public String getClass1()
			{
				return class1;
			}

		public void setClass1(String class1)
			{
				this.class1 = class1;
			}

		public String getClass1Grade()
			{
				return class1Grade;
			}

		public void setClass1Grade(String class1Grade)
			{
				this.class1Grade = class1Grade;
			}

		public String getClass2()
			{
				return class2;
			}

		public void setClass2(String class2)
			{
				this.class2 = class2;
			}

		public String getClass2Grade()
			{
				return class2Grade;
			}

		public void setClass2Grade(String class2Grade)
			{
				this.class2Grade = class2Grade;
			}

		public String getClass3()
			{
				return class3;
			}

		public void setClass3(String class3)
			{
				this.class3 = class3;
			}

		public String getClass3Grade()
			{
				return class3Grade;
			}

		public void setClass3Grade(String class3Grade)
			{
				this.class3Grade = class3Grade;
			}
		
	}
