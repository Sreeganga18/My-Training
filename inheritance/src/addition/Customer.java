package addition;

import encapsulation.Bank;

public class Customer {

	public static void main(String[] args) {
	Bank obj=new Bank();
	obj.setId(1000);
	obj.setMoney(3000);
	obj.calculate(2, 3);
	float n=obj.getMoney();
	System.out.println("Balance money " +n);
	System.out.println(obj.getId());

	}

}
