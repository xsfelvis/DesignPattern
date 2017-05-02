package xsf.design.command.three;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class ConcreateCommand2 extends Command {

    public ConcreateCommand2() {
        super(new ConcreateReceiver2());
    }

    public ConcreateCommand2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        super.receiver.doSomeThing();
    }
}
