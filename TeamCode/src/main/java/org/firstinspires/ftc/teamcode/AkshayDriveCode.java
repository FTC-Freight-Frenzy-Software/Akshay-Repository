package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// copy paste this for every class you create

@TeleOp(name = "AkshayDriveCode", group = "LinearOpMode")
// different for each class
// LinearOpMode connects to the phone
// TeleOp for driver control, Autonomous for autonomous

public class AkshayDriveCode extends LinearOpMode {
    // declare motors
    // sets motor to no values
    public DcMotor leftMotor = null;
    public DcMotor rightMotor = null;

    public void runOpMode() {
        // initialize motors
        leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");
        rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");

        // stops code until you press the start button on the phone
        waitForStart();

        while (opModeIsActive()) { // when you press start
            // y is up up and down
            // x is left and right
            leftMotor.setPower(1 * gamepad1.left_stick_y); // negate to move in opposite direction
            rightMotor.setPower(-1 * gamepad1.right_stick_y);
            leftMotor.setPower(1 * gamepad1.left_stick_x);
            rightMotor.setPower(-1 * gamepad1.left_stick_x);
            // there is a right stick and left stick on the controller
            // sets up so the sticks move up along with the motors
            // to make slower, change the multiplier (original is 1 and -1 )
            // decimal for slower, whole number for faster
        }
    }
}
