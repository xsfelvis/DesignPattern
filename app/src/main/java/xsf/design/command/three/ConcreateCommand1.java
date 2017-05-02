package xsf.design.command.three;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class ConcreateCommand1 extends Command {

    public ConcreateCommand1() {
        super(new ConcreateReceiver1());
    }


    public ConcreateCommand1(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        super.receiver.doSomeThing();
    }
}
