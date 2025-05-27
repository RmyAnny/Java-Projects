package MainSteuerung;

public class lightR1 {
	private boolean on;

	public lightR1() {
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
}
