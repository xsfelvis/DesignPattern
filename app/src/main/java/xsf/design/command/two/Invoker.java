package xsf.design.command.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
