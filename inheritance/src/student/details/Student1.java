package student.details;
import java.util.*;
public class Student1 {
	String name;
	int id;
	int age;
	Scanner sc=new Scanner(System.in);
	public void read()
	{
		System.out.println("Enter the student name");
		name=sc.nextLine();
		System.out.println("Enter the student id");
		id=sc.nextInt();
		System.out.println("Enter the student age");
		age=sc.nextInt();
		
	}

}
