package xsf.design.command.three;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
