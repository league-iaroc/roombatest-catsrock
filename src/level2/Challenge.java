package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed = 400;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void goStraight(int duration) {
		driveDirect(speed, speed);
		sleep(duration);
	}

	public void initialize() {
		goStraight(4000);
		driveDirect(0, speed);
		sleep(600);
		goStraight(5000);
		driveDirect(100, 0);
		sleep(1000);
		goStraight(2000);
		driveDirect(200, 0);
		sleep(1000);
		goStraight(1000);
	}

	public void loop() {

	}
}
