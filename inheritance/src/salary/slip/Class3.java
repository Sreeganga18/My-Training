package salary.slip;

public class Class3 extends Class2{
	float total;
	public void totalsalary() {
		total=(basicpay+hra-pf-deduction+bonus);
		
	}
	public void salarySlip() {
		System.out.println("SALARY SLIP");
		System.out.println("Basic pay =Rs"+basicpay);
		System.out.println("Deduction amount =Rs"+deduction);
		System.out.println("hra amount =Rs"+hra);
		System.out.println(" pf =Rs"+pf);
		System.out.println("Bonus amount =Rs"+bonus);
		System.out.println("Total salary=Rs"+total);

	}

	public static void main(String[] args) {
		Class3 obj2=new Class3();
		obj2.details(8000,1500,6000);
		obj2.calculation();
		obj2.totalsalary();
		obj2.salarySlip();
		

	}

}
