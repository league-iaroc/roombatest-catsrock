package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed = 400;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void goStraight(int duration) {
		driveDirect(speed, speed);
		sleep(duration);
	}

	public void goLeft(int duration) {
		driveDirect(0, speed);
		sleep(duration);
	}

	public void goRight(int duration) {
		driveDirect(speed, 0);
		sleep(duration);
	}

	public void initialize() {
		goStraight(2500);
		goLeft(500);
		goStraight(2500);
		goRight(500);
		goStraight(2500);
		goLeft(630);
		goStraight(3000);
		goRight(1000);
	}

	public void loop() {

	}
}
