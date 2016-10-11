/**
 *
 * Created by Maddie and Bria!, FTC Team 4962, The Rockettes
 * version 1.0 Aug 22, 2016
 *
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DigitalChannel;

/**
 * Example program to read data from a generic switch.
 * The sensor must be plugged into an digital port on the Device Interface Module and
 * configured on the phone as "switch".
 *
 * e.g.:
 * Hall effect sensor: See https://www.adafruit.com/product/158
 *
 */
@TeleOp(name = "Sensor: Generic Switch", group = "Sensor")
//@Disabled
public class SensorGenericSwitch extends LinearOpMode {

    /*
     * Main loop
     */
    @Override
    public void runOpMode() throws InterruptedException {

        /*
         * Initialize the hardware
         */

        DigitalChannel genericSwitch;

        genericSwitch = hardwareMap.digitalChannel.get("switch");

        // wait for the start button to be pressed.
        waitForStart();

        while (opModeIsActive()) {
            // is it on or off?

            boolean isItOpen = genericSwitch.getState();

            String switchState;
            if (isItOpen) {
                switchState = "Open";
            } else {
                switchState = "Closed";
            }
            telemetry.addData("time", "elapsed time: " + Double.toString(this.time));
            telemetry.addData("state", ":  " + switchState);
            telemetry.update();
        }
    }

}

