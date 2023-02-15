package criketdetails;
import java.util.Scanner;
public class Details extends Criket {
	int age;
	public void print() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
	}
	public void display() {
		System.out.println("  Details  ");
		System.out.println("Name "+name);
		System.out.println("Enter the age"+age);
		
	}
	public static void main(String []args) {
		Details obj=new Details();
		obj.player();
		obj.print();
		obj.display();
	}

}
