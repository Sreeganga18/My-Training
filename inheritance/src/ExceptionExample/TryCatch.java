package ExceptionExample;

public class TryCatch {
	public void test() {
		try {
			int a=100/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("handled");
		}
	}

	public static void main(String[] args) {
	TryCatch e=new TryCatch();
	e.test();

	}

}
