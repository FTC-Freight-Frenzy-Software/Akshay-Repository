package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp(name = "AkshayMecanum", group = "LinearOpMode")


public class AkshayMecanum extends LinearOpMode {
    public void LiftRaise (double inches) { // ticks to inches
        double ticks = 0.0082 * inches;
        // 288 ticks = 2.356 inches
        // 1 tick = 0.0082 inches
        // 1 inch = 121.951 ticks

        liftMotor.setPower(.5);
        liftMotor.setTargetPosition((int) ticks);
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while (liftMotor.isBusy()) {

        }

        liftMotor.setPower(0);
    }
    public DcMotor backLeftMotor = null;
    public DcMotor frontLeftMotor = null;
    public DcMotor backRightMotor = null;
    public DcMotor frontRightMotor = null;
    public DcMotor intakeMotor = null;
    public DcMotor liftMotor = null;
    public CRServo carouselServo = null;
    public Servo boxServo = null;


    public void runOpMode() {
        backLeftMotor = hardwareMap.get(DcMotor.class, "backLeftMotor");
        frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeftMotor");
        backRightMotor = hardwareMap.get(DcMotor.class, "backRightMotor");
        frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");
        intakeMotor = hardwareMap.get(DcMotor.class, "intakeMotor");
        liftMotor = hardwareMap.get(DcMotor.class, "liftMotor");
        carouselServo = hardwareMap.get(CRServo.class, "carouselServo");
        boxServo = hardwareMap.get(Servo.class, "boxServo");

        waitForStart();

        while(opModeIsActive()) {
            frontLeftMotor.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x);
            backLeftMotor.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x);
            frontRightMotor.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            backRightMotor.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);

            if (gamepad1.right_trigger > 0) {
                intakeMotor.setPower(-1);
            } else if (gamepad1.right_bumper) {
                intakeMotor.setPower(1);
            } else {
                intakeMotor.setPower(0);
            }

            if (gamepad1.x) {
                LiftRaise(14);
                boxServo.setDirection(Servo.Direction.FORWARD);
                boxServo.setPosition(220);
            }
//
//            if (gamepad1.left_bumper) {
//                liftMotor.setPower(.5);
//            } else if (gamepad1.left_trigger > 0) {
//                liftMotor.setPower(-.5);
//            } else {
//                liftMotor.setPower(0);
//            }
//
//            if (gamepad1.a) {
//                carouselServo.setPower(1);
//            } else if (gamepad1.b) {
//                carouselServo.setPower(-1);
//            } else {
//                carouselServo.setPower(0);
//            }
        }
    }
}
// lift angle and lift height
// use one button, convert ticks to inches in height for one function
// intake first, then with one button,