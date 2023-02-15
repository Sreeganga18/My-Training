package bankPinVerify;
import java.util.Scanner;
public class UserPin {
	public static void main(String[] args) {
		SetPin obj=new SetPin();
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  pin number");
		int a=sc.nextInt();
		obj.setter(a);
		obj.verifyPin();
		int b=sc.nextInt();
		obj.getter();
		
	}

	
}
