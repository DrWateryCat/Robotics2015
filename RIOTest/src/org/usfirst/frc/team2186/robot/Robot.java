
package org.usfirst.frc.team2186.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team2186.robot.autonomous.AutonomousManager;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	
	//Managers
	AutonomousManager autoManager = new AutonomousManager();
	DriveManager driveTrain = DriveManager.getInstance();
	
	//Inputs
	Joystick j1 = new Joystick(0);
	Joystick j2 = new Joystick(1);
	
	//Init robot systems
    public void robotInit() {
    	//TODO: Add more values to init.
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	driveTrain.update(j1);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    }
    
}
