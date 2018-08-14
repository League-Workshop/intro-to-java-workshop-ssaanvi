package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		//Start Here
		Robot SpaceKitty = new Robot();
		SpaceKitty.setPenWidth(5);
		SpaceKitty.penDown();
		SpaceKitty.setRandomPenColor();
		SpaceKitty.setSpeed(100);
		for(int i=0; i<4; i++) {
			SpaceKitty.move(100);
			SpaceKitty.turn(90);
		}
		
	
		
	
		
		
	}
}
