package employe.details;

public class PersonPrint extends PersonDetails {
	public void print() {
		System.out.println("person name= "+name);
		System.out.println("person salary= "+salary);
		System.out.println("person id= "+id);
	}

	public static void main(String[] args) {
		PersonPrint obj=new PersonPrint();
		obj.detail("sreeganga",10000,100);
		obj.print();
		

	}

}
