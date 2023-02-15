package encapsulation;

public class Bank {
	private float money;
	private int id;
	float intr;
	public void calculate(int r,int n) {
	intr=((money*n*r)/100);
	}
	public float getMoney() {
		money+=intr;
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
