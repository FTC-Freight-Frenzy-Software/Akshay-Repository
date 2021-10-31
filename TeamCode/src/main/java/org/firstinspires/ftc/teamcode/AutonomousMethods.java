package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name ="AutonomousMethods", group = "LinearOpMode")

public class AutonomousMethods extends LinearOpMode {
    static final double wheelDiameter = 3.7796;
    static final double ticksPerRevolution = 537.6;
    double circumference = Math.PI * wheelDiameter;
    // distance for one full rotation, how many do you need to go for distance

    AkshayConfiguration robot = new AkshayConfiguration();

    public void forward (double dist) {
        // Given a distance in inches, go forward that much
        double rotation = dist/circumference;
        // number of rotations to go distance
        int ticks = (int) (rotation * ticksPerRevolution);
        // ticks are a unit (motors have a certain amount of ticks per revolution)
        // cast to int

        robot.frontLeftMotor.setTargetPosition(ticks);
        robot.backLeftMotor.setTargetPosition(ticks);
        robot.frontRightMotor.setTargetPosition(ticks);
        robot.backRightMotor.setTargetPosition(ticks);
        robot.frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        // moves motor to a certain position based on the ticks and distance

        while (robot.frontLeftMotor.isBusy() || robot.frontRightMotor.isBusy() || robot.backLeftMotor.isBusy() || robot.backRightMotor.isBusy()) {
            // empty while loop to hold the code
        }

        robot.frontLeftMotor.setPower(0);
        robot.backLeftMotor.setPower(0);
        robot.frontRightMotor.setPower(0);
        robot.backRightMotor.setPower(0);
    }

    public void reverse (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) ((rotation * ticksPerRevolution) * (-1));

        robot.frontLeftMotor.setTargetPosition(ticks);
        robot.backLeftMotor.setTargetPosition(ticks);
        robot.frontRightMotor.setTargetPosition(ticks);
        robot.backRightMotor.setTargetPosition(ticks);
        robot.frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (robot.frontLeftMotor.isBusy() || robot.frontRightMotor.isBusy() ||robot.backLeftMotor.isBusy() || robot.backRightMotor.isBusy()) {

        }

        robot.frontLeftMotor.setPower(0);
        robot.backLeftMotor.setPower(0);
        robot.frontRightMotor.setPower(0);
        robot.backRightMotor.setPower(0);
    }

    public void right (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        robot.frontLeftMotor.setTargetPosition(ticks);
        robot.backLeftMotor.setTargetPosition(ticks * -1);
        robot.frontRightMotor.setTargetPosition(ticks * -1);
        robot.backRightMotor.setTargetPosition(ticks);
        robot.frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (robot.frontLeftMotor.isBusy() || robot.frontRightMotor.isBusy() ||robot.backLeftMotor.isBusy() || robot.backRightMotor.isBusy()) {

        }

        robot.frontLeftMotor.setPower(0);
        robot.backLeftMotor.setPower(0);
        robot.frontRightMotor.setPower(0);
        robot.backRightMotor.setPower(0);
    }

    public void left (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        robot.frontLeftMotor.setTargetPosition(ticks * -1);
        robot.backLeftMotor.setTargetPosition(ticks);
        robot.frontRightMotor.setTargetPosition(ticks);
        robot.backRightMotor.setTargetPosition(ticks * -1);
        robot.frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (robot.frontLeftMotor.isBusy() || robot.frontRightMotor.isBusy() ||robot.backLeftMotor.isBusy() || robot.backRightMotor.isBusy()) {

        }

        robot.frontLeftMotor.setPower(0);
        robot.backLeftMotor.setPower(0);
        robot.frontRightMotor.setPower(0);
        robot.backRightMotor.setPower(0);
    }

    public void rightDiagonalUp (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);


        robot.frontLeftMotor.setTargetPosition(ticks);
        robot.backRightMotor.setTargetPosition(ticks);
        robot.frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (robot.frontLeftMotor.isBusy() || robot.frontRightMotor.isBusy() ||robot.backLeftMotor.isBusy() || robot.backRightMotor.isBusy()) {

        }

        robot.frontLeftMotor.setPower(0);
        robot.backLeftMotor.setPower(0);
        robot.frontRightMotor.setPower(0);
        robot.backRightMotor.setPower(0);
    }

    public void rightDiagonalDown (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        robot.frontLeftMotor.setTargetPosition(ticks * -1);
        robot.backRightMotor.setTargetPosition(ticks * -1);
        robot.frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (robot.frontLeftMotor.isBusy() || robot.frontRightMotor.isBusy() ||robot.backLeftMotor.isBusy() || robot.backRightMotor.isBusy()) {

        }

        robot.frontLeftMotor.setPower(0);
        robot.backLeftMotor.setPower(0);
        robot.frontRightMotor.setPower(0);
        robot.backRightMotor.setPower(0);
    }

    public void leftDiagonalUp (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        robot.frontRightMotor.setTargetPosition(ticks);
        robot.backLeftMotor.setTargetPosition(ticks);
        robot.frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (robot.frontLeftMotor.isBusy() || robot.frontRightMotor.isBusy() ||robot.backLeftMotor.isBusy() || robot.backRightMotor.isBusy()) {

        }

        robot.frontLeftMotor.setPower(0);
        robot.backLeftMotor.setPower(0);
        robot.frontRightMotor.setPower(0);
        robot.backRightMotor.setPower(0);
    }

    public void leftDiagonalDown (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        robot.frontLeftMotor.setTargetPosition(ticks * -1);
        robot.backLeftMotor.setTargetPosition(ticks * -1);
        robot.frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (robot.frontLeftMotor.isBusy() || robot.frontRightMotor.isBusy() ||robot.backLeftMotor.isBusy() || robot.backRightMotor.isBusy()) {

        }

        robot.frontLeftMotor.setPower(0);
        robot.backLeftMotor.setPower(0);
        robot.frontRightMotor.setPower(0);
        robot.backRightMotor.setPower(0);
    }

    public void turnRight90 () {
        int ticks = 90;

        robot.frontLeftMotor.setTargetPosition(ticks);
        robot.backLeftMotor.setTargetPosition(ticks);
        robot.frontRightMotor.setTargetPosition(ticks * -1);
        robot.backRightMotor.setTargetPosition(ticks * -1);
        robot.frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (robot.frontLeftMotor.isBusy() || robot.frontRightMotor.isBusy() ||robot.backLeftMotor.isBusy() || robot.backRightMotor.isBusy()) {

        }

        robot.frontLeftMotor.setPower(0);
        robot.backLeftMotor.setPower(0);
        robot.frontRightMotor.setPower(0);
        robot.backRightMotor.setPower(0);
    }

    public void turnLeft90 () {
        int ticks = 90;

        robot.frontLeftMotor.setTargetPosition(ticks * -1);
        robot.backLeftMotor.setTargetPosition(ticks * -1);
        robot.frontRightMotor.setTargetPosition(ticks);
        robot.backRightMotor.setTargetPosition(ticks);

        robot.frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (robot.frontLeftMotor.isBusy() || robot.frontRightMotor.isBusy() ||robot.backLeftMotor.isBusy() || robot.backRightMotor.isBusy()) {

        }

        robot.frontLeftMotor.setPower(0);
        robot.backLeftMotor.setPower(0);
        robot.frontRightMotor.setPower(0);
        robot.backRightMotor.setPower(0);
    }

    public void carouselServo () {
        robot.carouselServo.setPosition(1);
        sleep(2000);
        robot.carouselServo.setPosition(0);
    }

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



    public void runOpMode(HardwareMap ahwMap) throws InterruptedException {
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
    }

    @Override
    public void runOpMode() throws InterruptedException {

    }
}

