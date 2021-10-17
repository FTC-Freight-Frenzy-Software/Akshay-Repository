package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp(name = "AkshayMecanum", group = "LinearOpMode")


public class AkshayMecanum extends LinearOpMode {
    public DcMotor backLeft = null;
    public DcMotor frontLeft = null;
    public DcMotor backRight = null;
    public DcMotor frontRight = null;
    public DcMotor intakeMotor = null;
    public DcMotor liftMotor = null;
    public CRServo carouselServo = null;


    public void runOpMode() {
        backLeft = hardwareMap.get(DcMotor.class, "backLeftMotor");
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeftMotor");
        backRight = hardwareMap.get(DcMotor.class, "backRightMotor");
        frontRight = hardwareMap.get(DcMotor.class, "frontRightMotor");
        intakeMotor = hardwareMap.get(DcMotor.class, "intakeMotor");
        liftMotor = hardwareMap.get(DcMotor.class, "liftMotor");
        carouselServo = hardwareMap.get(CRServo.class, "carouselServo");

        waitForStart();

        while(opModeIsActive()) {
            double horizontal = -1 * (gamepad1.left_stick_x);
            double vertical = gamepad1.left_stick_y;
            double turn = -1 * (gamepad1.right_stick_x);

            backLeft.setPower(-1 * (vertical + turn - horizontal));
            frontLeft.setPower(-1 * (vertical + turn + horizontal));
            backRight.setPower(vertical - turn + horizontal);
            frontRight.setPower(vertical - turn - horizontal);


            if (gamepad1.right_trigger > 0) {
                intakeMotor.setPower(-1);
            } else if (gamepad1.right_bumper) {
                intakeMotor.setPower(1);
            } else {
                intakeMotor.setPower(0);
            }

            if (gamepad1.left_bumper) {
                liftMotor.setPower(.5);
            } else if (gamepad1.left_trigger > 0) {
                liftMotor.setPower(-.5);
            } else {
                liftMotor.setPower(0);
            }

            if (gamepad1.a) {
                carouselServo.setPower(1);
            } else if (gamepad1.b) {
                carouselServo.setPower(-1);
            } else {
                carouselServo.setPower(0);
            }
        }
    }
}