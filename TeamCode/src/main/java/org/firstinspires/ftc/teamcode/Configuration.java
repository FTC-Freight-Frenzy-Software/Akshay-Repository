package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Configuration", group = "LinearOpMode")

public class Configuration extends LinearOpMode {
    AutonomousMethods methods = new AutonomousMethods();

    public void runOpMode() throws InterruptedException {
        methods.frontLeftMotor = null;
        methods.backLeftMotor = null;
        methods.frontRightMotor = null;
        methods.backRightMotor = null;
        methods.frontLeftMotor = hardwareMap.dcMotor.get("frontLeft");
        methods.backLeftMotor = hardwareMap.dcMotor.get("backLeft");
        methods.frontRightMotor = hardwareMap.dcMotor.get("frontRight");
        methods.backRightMotor = hardwareMap.dcMotor.get("backRight");
        methods.carouselServo = hardwareMap.get(CRServo.class, "carouselServo");
        methods.carouselServo.setDirection(CRServo.Direction.FORWARD);

        methods.waitForStart();
    }
}
