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
        methods.forward(7);
        methods.turnRight90();
        methods.forward(22);

        for (int i = 0; i < 8; i++) {
            methods.carouselServo.setPower(1);
            sleep(2000);
            methods.carouselServo.setPower(0);
            sleep(1000);
        }
    }
}
