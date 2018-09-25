package loops;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obediantrobot {
	public static void main(String[] args) {
		String x=JOptionPane.showInputDialog("What shape would you like the robot to draw??");
		if(x.equals("circle")){
		drawcircle();
		}
		if(x.equals("square")){
			drawSquare();
			}
		if(x.equals("triangle")){
			drawTriangle();
			}
		
	}

	static void drawSquare()

	{

		Robot r2d2 = new Robot();

		for (int i = 0; i < 4; i++) {
			r2d2.setSpeed(25);
			r2d2.penDown();
			r2d2.move(55);
			r2d2.turn(90);
		}
	}

	static void drawTriangle(){
		Robot r2d2 = new Robot();
		for (int i =0; i < 3; i++) {
			r2d2.setSpeed(25);
			r2d2.penDown();
		    r2d2.move(55);
		    r2d2.turn(120);
		}
	

	
		
	}

	static void drawcircle()

	{

		Robot r2d2 = new Robot();

		for (int i = 0; i < 36; i++) {
			r2d2.setSpeed(25);
			r2d2.penDown();
			r2d2.move(10);
			r2d2.turn(10);
		}
	}

}