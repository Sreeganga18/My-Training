package aggregation;

public class Aggregation12 {
	String house;
	int pin;
	Aggregation1 sd;
	public Aggregation12(String house,int pin,Aggregation1 sd) {
		this.house=house;
		this.pin=pin;
		this.sd=sd;
		
	}
	public void print() {
		System.out.println(sd.name+" "+sd.age);
		System.out.println(house+" "+pin);
	}

	public static void main(String[] args) {
		Aggregation1 s=new Aggregation1("sree",10);
		Aggregation12 a=new Aggregation12("sree",12,s);
		a.print();

	}

}
