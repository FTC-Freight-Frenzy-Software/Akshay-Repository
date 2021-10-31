/*
FTC Dashboard: http://192.168.43.1:8080/dash
Onbot Java: 192.168.43.1:8080
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class AkshayConfiguration { // the hardware map
    // drivetrain motors
    public DcMotor frontLeftMotor;  // four drivetrain motors
    public DcMotor frontRightMotor;
    public DcMotor backLeftMotor;
    public DcMotor backRightMotor;

    public Servo carouselServo;
    static Servo boxServo;


    public DcMotor intakeMotor;
    public DcMotor liftMotor;
    //public DcMotor wheelMotor = null;


    HardwareMap hwMap = null;

    public AkshayConfiguration () { // empty constructor

    }

    public void init (HardwareMap ahwMap) {
        hwMap = ahwMap;

        // front left motor
        frontLeftMotor = hwMap.get(DcMotor.class, "frontLeftMotor");  // initialize the motor
        frontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);  // set as forward
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);  // do not use encoders for this
        frontLeftMotor.setPower(0.0);  // initialize to no power

        // front right motor
        frontRightMotor = hwMap.get(DcMotor.class, "frontRightMotor");
        frontRightMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRightMotor.setPower(0.0);

        // back left motor
        backLeftMotor = hwMap.get(DcMotor.class, "backLeftMotor");
        backLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeftMotor.setPower(0.0);

        // back right motor
        backRightMotor = hwMap.get(DcMotor.class, "backRightMotor");
        backRightMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        backRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRightMotor.setPower(0.0);

        // carousel servo
        carouselServo = hwMap.get(Servo.class, "carouselServo");
        carouselServo.setDirection(Servo.Direction.FORWARD);

        //intake motor
        intakeMotor = hwMap.get(DcMotor.class, "intakeMotor");
        intakeMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        intakeMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        intakeMotor.setPower(0.0);

        // transfer motor
        liftMotor = hwMap.get(DcMotor.class, "liftMotor");
        liftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        liftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        liftMotor.setPower(0.0);

        // box servo
        boxServo = hwMap.get(Servo.class, "boxServo");
        boxServo.setDirection(Servo.Direction.FORWARD);
        /*
        // wheel motor
        wheelMotor = hwMap.get(DcMotor.class, "wheelMotor");
        wheelMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        wheelMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        wheelMotor.setPower(0.0);
         */

    }

}
