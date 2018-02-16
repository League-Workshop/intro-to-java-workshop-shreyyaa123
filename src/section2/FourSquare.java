package section2;

import java.util.Random;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot awesome = new Robot();

	void go() {
	awesome.setSpeed(1000000);
	awesome.penDown();
awesome.setPenWidth(20);
		for(int i=0;i<4;i++) {
			Random r = new Random();
			int a=r.nextInt(256);
	
			drawSquare();
			
		}
		}

		// 6. Use a for loop to repeat steps #7 to #8, four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right

	

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for(int i=0;i<4;i++){
		awesome.move(50);
awesome.turn(90);
		}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



