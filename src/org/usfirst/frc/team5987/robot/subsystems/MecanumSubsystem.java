package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class MecanumSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	RobotDrive mecanum=new RobotDrive(RobotMap.mecLeftFrontMotor, RobotMap.mecLeftBackMotor, RobotMap.mecRightFrontMotor, RobotMap.mecRightBackMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void mecDrive(double magnitude, double direction, double rotation) {
    	mecanum.mecanumDrive_Polar(magnitude, direction, rotation);
    }
}

