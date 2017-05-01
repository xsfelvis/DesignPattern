package xsf.design.command;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class CommandTest {
    public static void main (String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}
