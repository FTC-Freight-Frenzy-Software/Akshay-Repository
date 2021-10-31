package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "TopBlueAuton", group = "LinearOpMode")

public class TopBlueAuton extends LinearOpMode {
    AkshayConfiguration methods1 = new AkshayConfiguration();
    AutonomousMethods methods = new AutonomousMethods();

    @Override
    public void runOpMode() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            // go forward, then turn left
            methods.forward(3);
            methods.turnLeft90();
            methods.forward(36);
            // intake freight from corner area
            methods1.intakeMotor.setPower(1);
            sleep(4000);
            methods1.intakeMotor.setPower(0);
            // go to alliance shipping hub
            methods.reverse(48);
            methods.turnRight90();
            methods.forward(27);
            // put freight in the alliance shipping hub
            methods1.liftMotor.setPower(1);
            sleep(4000);
            methods1.liftMotor.setPower(0);
            methods1.boxServo.setPosition(1);
            sleep(2000);
            methods1.boxServo.setPosition(0);
        }
    }
}