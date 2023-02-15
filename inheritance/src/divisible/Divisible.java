package divisible;

public class Divisible extends Addition {
	public Divisible() {
		super(10,20);{
			System.out.println("sum = "+sum);
			if((sum%10)==0) {
				System.out.println("The number is divisible by 10");
				
			}
			else
			{
				System.out.println("The number is not divisble by 10");
			}
		}
	}
			
			public static void main(String []args) {
				Divisible obj=new Divisible();
				
				
			}
		}
	


