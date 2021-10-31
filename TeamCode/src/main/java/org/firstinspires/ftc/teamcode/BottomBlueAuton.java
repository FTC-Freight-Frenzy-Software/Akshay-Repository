package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "BottomBlueAuton", group = "LinearOpMode")

public class BottomBlueAuton extends LinearOpMode {
    AutonomousMethods methods = new AutonomousMethods();

    @Override
    public void runOpMode() throws InterruptedException {
        // foam tiles are 2 feet (24 inches) long
            methods.forward(10);
            methods.turnLeft90();
            methods.forward(14.5);
            // carousel servo moves forward for 2 seconds
            methods.carouselServo();
    }
}
// forward, left, forward, turn carousel