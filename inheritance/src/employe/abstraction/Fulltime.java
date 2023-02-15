package employe.abstraction;
import java.util.Scanner;
public class Fulltime extends Employee{
	final int FULHOUR=8;
	public void calSal() {
		System.out.println("your salary is "+(100*FULHOUR));
	}

	public static void main(String[] args) {
	Contractor con=new Contractor();
	Fulltime full=new Fulltime();
	full.print();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your designation");
	System.out.println("a : Contractor");
	System.out.println("b : Fulltime");
	String choice=sc.next();
	
	switch(choice) {
	case"a":con.calSal();
	break;
	case"b":full.calSal();
	}
	}

}
