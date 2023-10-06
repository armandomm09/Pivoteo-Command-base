package frc.robot;

import edu.wpi.first.math.trajectory.TrapezoidProfile;

public class Constants {

    public static final class pivotingConstants{

        public static final int buttonDesiredPosition1 = 2;
        public static final int buttonHomePosition = 1;
    
    
        public static final int motor1ID = 9;
        public static final int motor2ID = 10;
        public static final int motor3ID = 11;
    
    
        public static final double motorSprocketConversionFactor = 1 / 288.75;
        
        public static final double kP_Pivot = 0.7;
        public static final double kI_Pivot = 0;
        public static final double kD_Pivot = 0;
    
        
    
        public static final double maxVelocity = 20;
        public static final double maxAcceleration = 17;
        public static final TrapezoidProfile.Constraints constraints = 
                        new TrapezoidProfile.Constraints(maxVelocity, maxAcceleration);
                    
    
    }
    
}
