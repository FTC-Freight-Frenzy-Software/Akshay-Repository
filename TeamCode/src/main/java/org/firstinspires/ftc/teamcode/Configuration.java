package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Configuration", group = "LinearOpMode")

public class Configuration extends LinearOpMode {
    AutonomousMethods methods = new AutonomousMethods();

    public void runOpMode() throws InterruptedException {
        methods.frontLeft = null;
        methods.backLeft = null;
        methods.frontRight = null;
        methods.backRight = null;
        methods.frontLeft = hardwareMap.dcMotor.get("frontLeft");
        methods.backLeft = hardwareMap.dcMotor.get("backLeft");
        methods.frontRight = hardwareMap.dcMotor.get("frontRight");
        methods.backRight = hardwareMap.dcMotor.get("backRight");
        methods.carouselServo = hardwareMap.get(CRServo.class, "carouselServo");
        methods.carouselServo.setDirection(CRServo.Direction.FORWARD);

        methods.waitForStart();
    }
}
