package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "TopBlueAuton", group = "LinearOpMode")

public class TopBlueAuton extends LinearOpMode {
    AutonomousMethods methods = new AutonomousMethods();

    @Override
    public void runOpMode() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            methods.forward(3);
            methods.turnLeft90();
            methods.forward(36);
            // intake freight
            methods.reverse(48);
            methods.turnRight90();
            methods.forward(27);
            // put freight in the alliance shipping hub
        }
    }
}