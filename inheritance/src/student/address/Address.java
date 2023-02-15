package student.address;

public class Address {
private int houseno;
private String houseName;
private String city;
private Student a;
public Student getA() {
	return a;
}
public void setA(Student a) {
	this.a = a;
}
public int getHouseno() {
	return houseno;
}
public void setHouseno(int houseno) {
	this.houseno = houseno;
}
public String getHouseName() {
	return houseName;
}
public void setHouseName(String houseName) {
	this.houseName = houseName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
} 
public void display() {
	System.out.println("Student name = "+a.getName());
	System.out.println("Roll number = "+a.getRollnumber());
	System.out.println("house number = "+getHouseno());
	System.out.println("House name = "+getHouseName() );
	System.out.println("City name = "+getCity() );
}

}
