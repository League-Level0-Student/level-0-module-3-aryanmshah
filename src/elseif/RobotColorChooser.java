//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot r2d2 = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 100; i++) {
			String color = JOptionPane.showInputDialog("choose a color Options are red, blue, and Green.");

			if (color.equals("red")) {
           r2d2setPenColor(Color.red);
           r2d2.setPenWidth(10);
           
			}

			if (color.equals("blue")) {
				r2d2setPenColor(Color.blue);
				 r2d2.setPenWidth(10);
				
			}
			if (color.equals("green")) {
				r2d2setPenColor(Color.green);
				 r2d2.setPenWidth(10);
			}

		}

		// 5. Use an if/else statement to set the pen color that the user requested

		// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10

		// 2. Make the robot draw a shape (this will take more than one line of code)

	}

	private static void r2d2setPenColor(Color red) {
		// TODO Auto-generated method stub
		
	}
}
