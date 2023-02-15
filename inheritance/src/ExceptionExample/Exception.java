package ExceptionExample;

import java.io.IOException;

public class Exception {
	public void addition(int num,int num1) {
		try {
			int result;
			result=num+num1;
			if (result>20) {
				throw new ArithmeticException();
			}
			else throw new IOException();
		}
		catch(ArithmeticException a) {
			System.out.println("Arithmetic Exception");
			
			}
		catch(IOException e)
		{
			System.out.println("IOException ");
		}
		
	}
		public static void main(String []args) {
			Exception obj=new Exception();
			obj.addition(10, 20);
		
	}

}
