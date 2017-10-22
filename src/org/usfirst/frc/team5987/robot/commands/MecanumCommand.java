
package org.usfirst.frc.team5987.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5987.robot.subsystems.*;
import org.usfirst.frc.team5987.robot.Robot;

/**
 *
 */
public class MecanumCommand extends Command {

    public MecanumCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.MecanumSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double speedM = Math.sqrt(Math.pow(Robot.oi.rightStick.getX(),2) + Math.pow(Robot.oi.rightStick.getY(),2));
    	double angle = Math.atan(Robot.oi.rightStick.getY()/Robot.oi.rightStick.getX());
    	double rot = Robot.oi.rightStick.getZ();
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
