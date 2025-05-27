package MainSteuerung;

public class Main {
	public static void main(String[] args) {
		lightR1 light = new lightR1();
		lightR2 light2 = new lightR2();
		Steuerung steuerung = new Steuerung(light);
		Steuerung2 steuerung2 = new Steuerung2(light2);

		steuerung.switchIt(); // get on, get off, switch, 3 steps
		steuerung.switchIt();
		steuerung.switchIt();
		steuerung2.switchIt(); // get on, get out, switch, 3 steps
		steuerung2.switchIt();
		steuerung2.switchIt();
	}
} //2 lights could be managed over 2 raspberry pi, the code includes both of them
