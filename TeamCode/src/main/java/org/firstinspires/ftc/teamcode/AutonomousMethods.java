package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name ="AutonomousMethods", group = "LinearOpMode")

public class AutonomousMethods extends LinearOpMode {
    static final double wheelDiameter = 3.7796;
    static final double ticksPerRevolution = 537.6;
    double circumference = Math.PI * wheelDiameter;
    // distance for one full rotation, how many do you need to go for distance


    public void forward (double dist) {
        // Given a distance in inches, go forward that much
        double rotation = dist/circumference;
        // number of rotations to go distance
        int ticks = (int) (rotation * ticksPerRevolution);
        // ticks are a unit (motors have a certain amount of ticks per revolution)
        // cast to int

        frontLeftMotor.setTargetPosition(ticks);
        backLeftMotor.setTargetPosition(ticks);
        frontRightMotor.setTargetPosition(ticks);
        backRightMotor.setTargetPosition(ticks);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        // moves motor to a certain position based on the ticks and distance

        while (frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()) {
            // empty while loop to hold the code
        }

        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    public void reverse (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) ((rotation * ticksPerRevolution) * (-1));

        frontLeftMotor.setTargetPosition(ticks);
        backLeftMotor.setTargetPosition(ticks);
        frontRightMotor.setTargetPosition(ticks);
        backRightMotor.setTargetPosition(ticks);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()) {

        }

        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    public void right (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        frontLeftMotor.setTargetPosition(ticks);
        backLeftMotor.setTargetPosition(ticks * -1);
        frontRightMotor.setTargetPosition(ticks * -1);
        backRightMotor.setTargetPosition(ticks);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()) {

        }

        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    public void left (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        frontLeftMotor.setTargetPosition(ticks * -1);
        backLeftMotor.setTargetPosition(ticks);
        frontRightMotor.setTargetPosition(ticks);
        backRightMotor.setTargetPosition(ticks * -1);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()) {

        }

        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    public void rightDiagonalUp (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);


        frontLeftMotor.setTargetPosition(ticks);
        backRightMotor.setTargetPosition(ticks);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()) {

        }

        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    public void rightDiagonalDown (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        frontLeftMotor.setTargetPosition(ticks * -1);
        backRightMotor.setTargetPosition(ticks * -1);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()) {

        }

        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    public void leftDiagonalUp (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        frontRightMotor.setTargetPosition(ticks);
        backLeftMotor.setTargetPosition(ticks);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()) {

        }

        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    public void leftDiagonalDown (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        frontLeftMotor.setTargetPosition(ticks * -1);
        backLeftMotor.setTargetPosition(ticks * -1);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()) {

        }

        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    public void turnRight90 () {
        int ticks = 90;

        frontLeftMotor.setTargetPosition(ticks);
        backLeftMotor.setTargetPosition(ticks);
        frontRightMotor.setTargetPosition(ticks * -1);
        backRightMotor.setTargetPosition(ticks * -1);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()) {

        }

        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    public void turnLeft90 () {
        int ticks = 90;

        frontLeftMotor.setTargetPosition(ticks * -1);
        backLeftMotor.setTargetPosition(ticks * -1);
        frontRightMotor.setTargetPosition(ticks);
        backRightMotor.setTargetPosition(ticks);

        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()) {

        }

        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
    }

    DcMotor frontLeftMotor = null;
    DcMotor backLeftMotor = null;
    DcMotor frontRightMotor = null;
    DcMotor backRightMotor = null;
    DcMotor intakeMotor = null;
    public Servo boxServo = null;
    public Servo liftServo = null;
    CRServo carouselServo = null;
    @Override

    public void runOpMode() throws InterruptedException {
        frontLeftMotor = hardwareMap.dcMotor.get("leftFrontMotor");
        backLeftMotor = hardwareMap.dcMotor.get("leftBackMotor");
        frontRightMotor = hardwareMap.dcMotor.get("rightFrontMotor");
        backRightMotor = hardwareMap.dcMotor.get("rightBackMotor");
        intakeMotor = hardwareMap.dcMotor.get("intakeMotor");
        boxServo = hardwareMap.get(Servo.class, "boxServo");
        liftServo = hardwareMap.get(Servo.class, "liftServo");
        carouselServo = hardwareMap.get(CRServo.class, "carouselServo");
        carouselServo.setDirection(CRServo.Direction.FORWARD);

        waitForStart();
    }
}

