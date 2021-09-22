package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name ="AkshayAutonomous", group = "LinearOpMode")
// group is always LinearOpMode

public class AkshayAuton extends LinearOpMode {
// implement runOpMode method

    DcMotor leftMotor = null;
    DcMotor rightMotor = null;

    @Override
    public void runOpMode() throws InterruptedException {
        // initialize motors while the opMode is running
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        // sets the direction of the motors FORWARD
        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        // waits until you start the code on the test phone

        leftMotor.setPower(1);
        rightMotor.setPower(1);
        // moves the motors at full speed

        sleep(1000);
        // moves the robot for 1000 milliseconds

        leftMotor.setPower(0);
        rightMotor.setPower(0);
        // stops motors

        leftMotor.setPower(.5);
        rightMotor.setPower(-.5);
        // half speed

        sleep(500);
        // moves for 500 milliseconds

        leftMotor.setPower(0);
        rightMotor.setPower(0);
        // stops motors
        // forward, turn to the right, go forward again
    }
}
