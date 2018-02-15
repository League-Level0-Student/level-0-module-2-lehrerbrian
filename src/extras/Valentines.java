package extras;

import org.jointheleague.graphical.robot.Robot;

public class Valentines {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		rob.moveTo(225, 150);
		rob.setSpeed(500
				);
		rob.hide();
		rob.setWindowImage("images.jpg");
		rob.penDown();
		int x = rob.getX();
		for (int j = 0; j < 2; j++) {

			rob.setAngle(0);
			for (int i = 0; i < 181; i++) {
				rob.move(2);
				rob.turn(1);
			}
		}
		int y = rob.getX();
		int s = (Math.abs(y-x)/2)+x;
		rob.setAngle(-154);
		int count = 0;
		//while(rob.getX()>s) {
		//	rob.move(1);
		//	count++;
		//}
		rob.move(521);
		System.out.println(count);
		rob.setAngle(-26);
		rob.move(521);

	}
}
