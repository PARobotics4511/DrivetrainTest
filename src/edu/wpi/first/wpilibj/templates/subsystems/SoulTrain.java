/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.Drive;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Developer
 */
public class SoulTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public RobotDrive drivetrain;
    
    public SoulTrain() {
        drivetrain = new RobotDrive(RobotMap.leftFrontMotor,RobotMap.leftRearMotor,RobotMap.rightFrontMotor,RobotMap.rightRearMotor);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new Drive());
    }
    
    public void mecanumDrive(double x, double y, double z) {
        drivetrain.mecanumDrive_Cartesian(x, y, z, 0);
    }
}
