package criketdetails;
import java.util.Scanner;
public class Criket {
	String name;
	String nationality;
	int age;
	public void player() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of player");
		name=sc.nextLine();
		System.out.println("Enter the nationality");
		nationality=sc.nextLine();
	}

}
