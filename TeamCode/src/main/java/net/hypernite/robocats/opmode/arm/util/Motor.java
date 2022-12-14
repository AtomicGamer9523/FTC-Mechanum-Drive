package net.hypernite.robocats.opmode.arm.util;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Motor {
    private final DcMotor MOTOR;// DcMotor It will interact With

    /**
     * Creates a new Motor Instance
     */
    public Motor(DcMotor motor) {
        this.MOTOR = motor;
    }

    /**
     * Sets the power of the current motor
     */
    public void setPower(double speed) {
        this.MOTOR.setPower(speed);
    }
}