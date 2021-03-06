package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TankSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	static Victor leftRearMotor;
	static Victor leftFrontMotor;
	static Victor rightRearMotor;
	static Victor rightFrontMotor;
	
	private static Encoder leftEncoder;
	private static Encoder rightEncoder;
	
	private final double distancePerPulse = 0.00133;
	
	final static double TANK_SPEED_FACTOR = RobotMap.TANK_SPEED_FACTOR; // the speed is multiplied by this factor
	
	public TankSubsystem() {
    	// set ports for the victors using the preassigned values of the RobotMap
    	leftRearMotor = new Victor(RobotMap.leftRearMotor);
    	leftFrontMotor = new Victor(RobotMap.mecLeftFrontMotor);
    	rightRearMotor = new Victor(RobotMap.rightRearMotor);
    	rightFrontMotor = new Victor(RobotMap.mecRightFrontMotor);
    	
    	// set the timeout used for updating the speed
    	leftRearMotor.setExpiration(0.05);
    	leftFrontMotor.setExpiration(0.05);
    	rightRearMotor.setExpiration(0.05);
    	rightFrontMotor.setExpiration(0.05);
    	
    	leftRearMotor.setInverted(true);
    	leftFrontMotor.setInverted(true);
    	
    	
    	leftEncoder = new Encoder(RobotMap.leftDriveChanelA, RobotMap.leftDriveChanelB);
    	rightEncoder = new Encoder(RobotMap.rightDriveChanelA, RobotMap.rightDriveChanelB);
    	
    	leftEncoder.setDistancePerPulse(distancePerPulse);
    	rightEncoder.setDistancePerPulse(distancePerPulse);
	}
	
    public void initDefaultCommand() {
 
    }
    
    public void setLeft(double speed){
    	speed *= TANK_SPEED_FACTOR;
    	leftRearMotor.set(speed);
    	leftFrontMotor.set(speed);
    }
    
    public void setRight(double speed){
    	speed *= TANK_SPEED_FACTOR;
    	rightRearMotor.set(speed);
    	rightFrontMotor.set(speed);
    }
    
    /**
     * Set speed for both motors (-1 < speed < 1)
     * @param speedL speed of left motors
     * @param speedR speed of right motors
     */
    public void drive(double speedL, double speedR){
    	setLeft(speedL);
    	setRight(speedR);
    }
    
    /**
     * turns the robot in place 
     * @param if positive, turn right, else turns left (range of -1 to 1)
     */
   
    
    public  double getLeftEncoder() {
    	
    	return -leftEncoder.getDistance();
    }
    
    public  double getRightEncoder() {
    	
    	return rightEncoder.getDistance();
    }
}

