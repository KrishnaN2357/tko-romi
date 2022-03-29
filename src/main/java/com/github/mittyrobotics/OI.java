package com.github.mittyrobotics;
import edu.wpi.first.wpilibj.XboxController;
public class OI {
    private static OI instance;
    private XboxController xboxController;

    public static OI getInstance(){
        if(instance == null){
            instance = new OI();
        }
        return instance;
    }

    public XboxController getXboxController(){
        if(xboxController == null){
            xboxController = new XboxController(0);
        }
        return xboxController;
    }
}