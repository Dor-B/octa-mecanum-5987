package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PneoSwitchSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	/**
	 * The left piston.
	 */
	DigitalOutput leftPiston = new DigitalOutput(RobotMap.leftPiston);
	/**
	 * The right piston.
	 */
	DigitalOutput rightPiston = new DigitalOutput(RobotMap.rightPiston);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    /**
     * Set the value of the left piston.
     *
     * @param value true is on, off is false
     */
    public void setLefttPiston(boolean value)
    {
    		leftPiston.set(value);
    }
    /**
     * Set the value of the right piston.
     *
     * @param value true is on, off is false
     */
    public void setRightPiston(boolean value)
    {
    		rightPiston.set(value);
    }
    /**
     * Gets the value being output from the left piston.
     *
     * @return the state of the left piston.
     */
    public boolean getLeftPiston()
    {
    	return leftPiston.get();
    }
    /**
     * Gets the value being output from the right piston.
     *
     * @return the state of the right piston.
     */
    public boolean getRightPiston()
    {
    	return rightPiston.get();
    }
}