package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Hardware {
    // Create Motors
    // click enter after typing DcMotor to import the correct directory
    public DcMotor frontRightMotor = null; // null means not initiated
    public DcMotor frontLeftMotor = null;
    public DcMotor backRightMotor = null;
    public DcMotor backLeftMotor = null;

    // Create Servo
    // click enter after typing Servo to import the correct directory
    public Servo randomServo = null;

    // additional variables (don't use public in these, could cause problems)
           HardwareMap hardwareMap = null;
    public ElapsedTime runtime = new ElapsedTime();

    // constructor
    public Hardware(HardwareMap hwMap) {
        initialize(hwMap);
    }

    private void initialize(HardwareMap hwMap) {

    }


}
