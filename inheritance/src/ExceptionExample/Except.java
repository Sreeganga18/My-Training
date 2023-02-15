package ExceptionExample;

public class Except {
	public static void add(int a) {
		if(a<18) {
			throw new ArithmeticException("not valis");
		}
		else {
			System.out.println("valid");
			
		}
		//System.out.println("rest of code");
		
 {
	System.out.println("hii");
	}
	}
	public static void main(String []args)
	{
		Except.add(18);
		
	}
}
