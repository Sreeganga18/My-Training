package addition;

public class Substraction extends Addition {
	public void sub() {
		super.a=a;
		int sub=a-b;
		System.out.println(sub);
		System.out.println(super.a);
	}


	public static void main(String[] args) {
		Substraction obj=new Substraction();
		obj.sub();
		obj.add();

	}

}
