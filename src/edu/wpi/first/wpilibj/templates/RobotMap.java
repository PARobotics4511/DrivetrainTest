package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    public static Talon leftFrontMotor;
    public static Talon rightFrontMotor;
    public static Talon leftRearMotor;
    public static Talon rightRearMotor;
    
    public RobotMap() {
        leftFrontMotor = new Talon(1);
        rightFrontMotor = new Talon(2);
        leftRearMotor = new Talon(3);
        rightRearMotor = new Talon(4);
    }
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
