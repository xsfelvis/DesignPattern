package xsf.design.command.three;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
