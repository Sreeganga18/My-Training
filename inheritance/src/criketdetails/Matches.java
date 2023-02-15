package criketdetails;

import java.util.Scanner;

public class Matches extends Criket{
	String team;
	int number;
	int century;
	public void match() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team");
		team=sc.nextLine();
		System.out.println("Enter the number of matches ");
		number=sc.nextInt();
		System.out.println("Enter the number of centuries");
		century=sc.nextInt();
	}
	public void display1() {
		System.out.println("  Matches  ");
		System.out.println("Enter the name "+name);
		System.out.println("Enter the team "+team);
		System.out.println("Enter the number of matches "+number);
		System.out.println("Enter the centuries "+century);
		
	}
	public static void main(String []args) {
		Matches obj2=new Matches();
		obj2.player();
		obj2.match();
		obj2.display1();
	}

}
