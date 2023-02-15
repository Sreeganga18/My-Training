package ExceptionExample;

public class ExcepExample {
	public void operation(int num,int num1) {
		int result;
		try {
			int arr[]=new int[5];
			result=num/num1;
			System.out.println("result = "+result);
			for(int i=0;i<5;i++) {
				arr[i]=i+1;
				System.out.println(arr[i]+" ");
			}
		
		}
	

	catch(ArithmeticException a) {
		System.out.println("divisible by zero is not possible");
	}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Arrays");
		}
		
	
	finally{
		System.out.println("finally ");
		
	}
		System.out.println("end");
	}
	

	public static void main(String[] args) {
		ExcepExample obj=new ExcepExample();
		obj.operation(10, 5);
	
		

	}


}

