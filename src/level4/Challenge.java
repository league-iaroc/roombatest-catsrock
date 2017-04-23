package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed = 400;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
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

	/**
	 * complete the MAZE Hint: use bump sensors
	 */

	public void initialize() {

	}

	public void loop() {
		if (leftBump) {
			goRight(500);
			goStraight(1000);
			leftBump = false;
		}
		if (rightBump) {
			goLeft(500);
			goStraight(1000);
			rightBump = false;
		}
	}
}
