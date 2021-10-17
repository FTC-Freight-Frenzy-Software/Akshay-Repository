package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "AkshayMecanum", group = "LinearOpMode")


public class AkshayMecanum extends LinearOpMode {
    public DcMotor backLeft = null;
    public DcMotor frontLeft = null;
    public DcMotor backRight = null;
    public DcMotor frontRight = null;
    public DcMotor intakeMotor = null;
    public Servo boxServo = null;
    public Servo liftServo = null;
    public Servo carouselServo = null;


    public void runOpMode() {
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        intakeMotor = hardwareMap.get(DcMotor.class, "intakeMotor");
        boxServo = hardwareMap.get(Servo.class, "boxServo");
        liftServo = hardwareMap.get(Servo.class, "liftServo");
        carouselServo = hardwareMap.get(Servo.class, "carouselServo");

        waitForStart();

        while(opModeIsActive()) {
            double horizontal = gamepad1.left_stick_x;
            double vertical = gamepad1.left_stick_y;
            double turn = gamepad1.right_stick_x;

            backLeft.setPower(vertical + turn - horizontal);
            frontLeft.setPower(vertical + turn + horizontal);
            backRight.setPower(vertical - turn + horizontal);
            frontRight.setPower(vertical - turn - horizontal);

            if (gamepad1.right_trigger > 0) {
                intakeMotor.setPower(1);
            }

            if (gamepad1.left_bumper) {
                liftServo.setPosition(1);
            }

            if (gamepad1.left_trigger > 0) {
                boxServo.setPosition(0.8);
            }

            if (gamepad1.right_bumper) {
                carouselServo.setPosition(0.7);
            }

            intakeMotor.setPower(0);
            liftServo.setPosition(0);
            boxServo.setPosition(0);
            carouselServo.setPosition(0);

        }
    }
}