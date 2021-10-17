package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name ="AutonomousMethods", group = "LinearOpMode")

public class AutonomousMethods extends LinearOpMode {
    static final double wheelDiameter = 3;
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

        frontLeft.setTargetPosition(ticks);
        backLeft.setTargetPosition(ticks);
        frontRight.setTargetPosition(ticks);
        backRight.setTargetPosition(ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        // moves motor to a certain position based on the ticks and distance

        while (frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy()) {
            // empty while loop to hold the code
        }

        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }

    public void reverse (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) ((rotation * ticksPerRevolution) * (-1));

        frontLeft.setTargetPosition(ticks);
        backLeft.setTargetPosition(ticks);
        frontRight.setTargetPosition(ticks);
        backRight.setTargetPosition(ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy()) {

        }

        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }

    public void right (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        frontLeft.setTargetPosition(ticks);
        backLeft.setTargetPosition(ticks * -1);
        frontRight.setTargetPosition(ticks * -1);
        backRight.setTargetPosition(ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy()) {

        }

        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }

    public void left (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        frontLeft.setTargetPosition(ticks * -1);
        backLeft.setTargetPosition(ticks);
        frontRight.setTargetPosition(ticks);
        backRight.setTargetPosition(ticks * -1);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy()) {

        }

        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }

    public void rightDiagonalUp (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);


        frontLeft.setTargetPosition(ticks);
        backRight.setTargetPosition(ticks);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy()) {

        }

        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }

    public void rightDiagonalDown (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        frontLeft.setTargetPosition(ticks * -1);
        backRight.setTargetPosition(ticks * -1);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy()) {

        }

        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }

    public void leftDiagonalUp (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        frontRight.setTargetPosition(ticks);
        backLeft.setTargetPosition(ticks);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy()) {

        }

        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }

    public void leftDiagonalDown (double dist) {
        double rotation = dist/circumference;
        int ticks = (int) (rotation * ticksPerRevolution);

        frontLeft.setTargetPosition(ticks * -1);
        backLeft.setTargetPosition(ticks * -1);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy()) {

        }

        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }

    public void turnRight90 () {
        int ticks = 90;

        frontLeft.setTargetPosition(ticks);
        backLeft.setTargetPosition(ticks);
        frontRight.setTargetPosition(ticks * -1);
        backRight.setTargetPosition(ticks * -1);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy()) {

        }

        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }

    public void turnLeft90 () {
        int ticks = 90;

        frontLeft.setTargetPosition(ticks * -1);
        backLeft.setTargetPosition(ticks * -1);
        frontRight.setTargetPosition(ticks);
        backRight.setTargetPosition(ticks);

        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy()) {

        }

        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }

    DcMotor frontLeft = null;
    DcMotor backLeft = null;
    DcMotor frontRight = null;
    DcMotor backRight = null;
    DcMotor intakeMotor = null;
    CRServo carouselServo = null;
    @Override

    public void runOpMode() throws InterruptedException {
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backRight = hardwareMap.dcMotor.get("backRight");
        carouselServo = hardwareMap.get(CRServo.class, "carouselServo");
        carouselServo.setDirection(CRServo.Direction.FORWARD);

        waitForStart();
    }
}

