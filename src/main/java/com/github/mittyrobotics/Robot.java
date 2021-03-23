package com.github.mittyrobotics;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;


//Java automatically runs this class, and calls the various functions.
/*
 *  YOUR WIFI MUST BE CONNECTED TO ROMI FOR THIS TO WORK
 */
public class Robot extends TimedRobot {

    //Runs when the robot is first started up and should be used for any initialization code
    /*
     *  INITIALIZE CLASSES HERE
     */

    Spark sparkLeft;
    Encoder encoder;
    RomiGyro gyro;
    public void robotInit() {
        sparkLeft = new Spark(Constants.LEFT_MOTOR_ID);
        encoder = new Encoder(Constants.LEFT_ENCODER_IDS[0], Constants.LEFT_ENCODER_IDS[1]);

        encoder.reset();
        encoder.setDistancePerPulse(1./256.);
    }

    //Runs when antonomous mode (robot runs on its own) first activated via the desktop application
    @Override
    public void autonomousInit() {

    }

    //Runs when teleoperated mode (robot controlled by driver) is first activated
    @Override
    public void teleopInit() {

    }

    //Runs when test mode is activated
    @Override
    public void testInit() {

    }

    //Runs whenever the robot is on, periodically: should be used for command schedulers
    @Override
    public void robotPeriodic() {

    }

    //Runs periodically during autonomous mode
    @Override
    public void autonomousPeriodic() {

    }

    //Runs periodically during teleoperated mode
    /*
     *  WRITE YOUR DRIVE CODE HERE
     */
    @Override
    public void teleopPeriodic() {
        double distance = encoder.getDistance();
        double rate = encoder.getRate();

        if (distance<5){
            sparkLeft.set(1);
        }
        else{
            sparkLeft.set(0);
        }

    }

    //Runs periodically during test mode
    @Override
    public void testPeriodic() {

    }
}