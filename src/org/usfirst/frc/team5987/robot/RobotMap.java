 package org.usfirst.frc.team5987.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static int leftFrontMotor = 6;
	public static int leftRearMotor = 7;
	public static int rightRearMotor = 3;
	public static int rightFrontMotor = 2;
	
	public static int leftDriveChanelA = 4;
	public static int leftDriveChanelB = 5;
	
	public static int rightDriveChanelA =6;
	public static int rightDriveChanelB = 7;
	public static double TANK_SPEED_FACTOR = 1;
}
