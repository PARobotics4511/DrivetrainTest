
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    public double deadzone;
    
    public Joystick stick1;
    public Joystick stick2;
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    public OI() {
        stick1 = new Joystick(1);
        stick2 = new Joystick(2);
        deadzone = .1;
    }
    
    public double getXMovement() {
        if (stick1.getX() > deadzone) {
            return stick1.getX()*stick1.getX();
        }
        else if (stick1.getX() < -deadzone) {
            return -stick1.getX()*stick1.getX();
        }
        else {
            return 0;
        }
    }
    
    public double getYMovement() {
        if (stick1.getY() > deadzone) {
            return stick1.getY()*stick1.getY();
        }
        else if (stick1.getY() < -deadzone) {
            return -stick1.getY()*stick1.getY();
        }
        else {
            return 0;
        }
    }
    
    public double getRotationMovement() {
        if (stick2.getX() > deadzone) {
            return stick2.getX()*stick2.getX();
        }
        else if (stick2.getX() < -deadzone) {
            return -stick2.getX()*stick2.getX();
        }
        else {
            return 0;
        }
    }
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

