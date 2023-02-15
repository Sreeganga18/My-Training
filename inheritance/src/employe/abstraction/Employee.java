package employe.abstraction;

import java.util.Scanner;

public abstract class Employee {
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	public void print() {
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter the age");
		age=sc.nextInt();
		}
	
	public abstract void calSal();
	}
