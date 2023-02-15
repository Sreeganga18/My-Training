package student.details;

public class Student2 extends Student1{
	public void display() {
		super.read();
		System.out.println("student name is= "+name);
		System.out.println("student id is= "+id);
		System.out.println("student age is ="+age);
	}

	public static void main(String[] args) {
		Student2 obj=new Student2();
		obj.display();
		
		

	}

}
