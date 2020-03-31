package springdemo.java.roy;

public class Student 
		{
			int RollNo;
			String StudentName;
	       
		    //constructor of field RollNo and StudentName.
			public Student(int RollNo, String StudentName) 
				{
					this.RollNo = RollNo;
					this.StudentName = StudentName;
				}

			public void DisplayStudent()
				{
					System.out.println("Student Name is:"+ StudentName + "\nStudent Roll no is:"+ RollNo);
				}
	
		}
