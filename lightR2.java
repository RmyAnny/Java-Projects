package MainSteuerung;

public class lightR2 {

	private boolean on;

	public lightR2() {
		this.on = false;
	}

	public void getOn() {
		this.on = true;
		System.out.println("Light is on now");

	}

	public void getOut() {
		this.on = false;
		System.out.println("Light is off now");
	}

	public boolean isOn() {
		return this.on;
	}
} //Hier kann auch benannt werden, welche Lapme aus oder an ist 
