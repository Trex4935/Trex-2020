// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Extensions;

import java.util.Map;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.Constants;

/** Add your docs here. */
// Creating a class and methods to be able to load data from Shuffleboard to running robot code.
public class Init_Dashboard {
    private ShuffleboardTab tab = Shuffleboard.getTab("Inputs");
    public NetworkTableEntry maxSpeed =
        tab.add("Max Speed", Constants.speedLimitDefault)
        .withWidget(BuiltInWidgets.kNumberSlider) // specify the widget of number slider
        .withProperties(Map.of("min", 0, "max", 1)) // specify widget properties of min 0 max 1
        .withPosition(3,3) // set widget position
        .getEntry();

    public NetworkTableEntry driveType =     
    tab.add("Drive Type = Tank", Constants.arcadeDrive)
    .withWidget(BuiltInWidgets.kToggleButton)
    .withPosition(6,0)
    .withSize(2,2)
    .getEntry();
        
    public NetworkTableEntry differentialDriveWidget = 
    tab.add("Differential Drive", 0) 
    .withWidget(BuiltInWidgets.kDifferentialDrive)
    .withProperties(Map.of("Wheels/Number of wheels", 4,"Wheels/Wheel diameter", 80.0,"Visuals/Show velocity vectors", true))
    .withPosition(0,0) 
    .getEntry();

}
