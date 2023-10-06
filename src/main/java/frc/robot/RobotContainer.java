// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Commands.pivotPIDCommand;
import frc.robot.Commands.pivotingCommand;
import frc.robot.Subsystems.pivotingSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {

  
  private final pivotingSubsystem pivot;

  private  Joystick control = new Joystick(0);

  public RobotContainer() {

    pivot = pivotingSubsystem.getInstance();

    /*pivot.setDefaultCommand(new pivotingCommand(
      () -> control.getRawAxis(1)
    ));
    
    */
    configureBindings();

  }

  
  private void configureBindings() {
 
    //Cube position
    new JoystickButton(control, 5).whileFalse(new pivotPIDCommand(.47));

    // Posicion place cone
    new JoystickButton(control, 6).whileFalse(new pivotPIDCommand(0.45));

    // Home position
    new JoystickButton(control, 1).whileFalse(new pivotPIDCommand(0.02));

    //Pick from floor
    new JoystickButton(control, 4).whileFalse(new pivotPIDCommand(1.35));
  
  }

 
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
