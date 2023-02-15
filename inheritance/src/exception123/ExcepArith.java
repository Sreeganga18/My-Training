package exception123;

public class ExcepArith {

	public static void main(String[] args) {
	
try {
	int a=30/0;
	System.out.println(a);
	
}
	catch(ArithmeticException e) {
		System.out.println("ctr statemnt");
	}
	
	}

}
