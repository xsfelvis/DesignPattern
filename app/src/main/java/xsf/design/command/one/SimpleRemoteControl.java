package xsf.design.command.one;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class SimpleRemoteControl {
    ICommand slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(ICommand command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
