package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "AkshayServo", group = "LinearOpMode")

public class AkshayServo extends LinearOpMode {
    Servo carousel = null;

    @Override
    public void runOpMode() throws InterruptedException {
        carousel = hardwareMap.get(Servo.class,"carousel");
        // initializing servo motor

        carousel.setDirection(Servo.Direction.FORWARD);
        // forward direction

        waitForStart();

        carousel.setPosition(0.5);
        // sets the position of the motor, similar to how motors go to a certain position
        // only use while OpModeIsActive loop when you need to run something repeatedly

    }
}
