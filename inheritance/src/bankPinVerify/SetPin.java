package bankPinVerify;

public class SetPin {
	private int pin;
	public void setter(int pin) {
		this.pin=pin;
	}
public int  getter() {
	
	return pin;
}
public void verifyPin() {
	if(pin==1001) {
		System.out.println("Valid pin = "+pin);
	}
	else if(pin==1234) {
		System.out.println("Valid pin = "+pin);
	}
	else if(pin==1212) {
		System.out.println("Valid pin = "+pin);
	}
	else {
		System.out.println("Invalid pin = "+pin);
	}
}
}
