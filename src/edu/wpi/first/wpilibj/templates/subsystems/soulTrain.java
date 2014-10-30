/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.Drive;

/**
 *
 * @author Developer
 */
public class soulTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Talon rFMotor;
    Talon lFMotor;
    Talon rRMotor;
    Talon lRMotor;
    
    RobotDrive drivetrain;
    
    public soulTrain() {
        drivetrain.setSafetyEnabled(false);
        rFMotor = new Talon(RobotMap.rightFrontMotor);
        lFMotor = new Talon(RobotMap.leftFrontMotor);
        rRMotor = new Talon(RobotMap.rightRearMotor);
        lRMotor = new Talon(RobotMap.leftRearMotor);
        drivetrain = new RobotDrive(lFMotor, lRMotor, rFMotor, rRMotor);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new Drive());
    }
    
    public void mecanumDrive(double x, double y, double z) {
        drivetrain.mecanumDrive_Cartesian(x,y,z,0);
    }
}
