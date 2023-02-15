package student.address;

public class Print {
	public static void main(String []args) {
		Student obj=new Student();
		obj.setName("Sreeganga");
		obj.setRollnumber(10);
		
		Address obj1=new Address();
		obj1.setHouseno(101);
		obj1.setHouseName("sreeragam");
		obj1.setCity("tvm");
		obj1.setA( obj);
		
		obj1.display();
	}

}