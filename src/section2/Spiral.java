package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot SpaceKitty = new Robot();
		SpaceKitty.miniaturize();
		SpaceKitty.sparkle();

		// 5. Set your robot's pen down
		SpaceKitty.penDown();

		// 3. Set the robot to go at max speed (100)
		SpaceKitty.setSpeed(100);

		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		int j=0;
		for (int i = 0; i < 350; i++, j++) {

			// 7. Change the pen color to random
//			SpaceKitty.setRandomPenColor();

			// 6. Move the robot 5 times the loop counter (5*i)
			SpaceKitty.move(1 * i);
			
			if(j < 8) {
				SpaceKitty.setPenColor(Color.BLACK);
			} else {
				SpaceKitty.setPenColor(Color.WHITE);
			}
			
			if(j>14) {
				j=0;
			}

			// 2. Turn the robot 360/7 degrees to the right
			SpaceKitty.turn(20);
			SpaceKitty.setPenWidth(i);
		} // 8. Set the pen width to i

	}
}
