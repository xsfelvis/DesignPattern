package xsf.design.command.three;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class TestCimmandThree {
    public static void main(String[] args) {
        //声明调用者
        Invoker invoker = new Invoker();
        //定义一个接收者
       // Receiver receiver = new ConcreateReceiver1();
        //定义一个发送命令给接收者
        Command command = new ConcreateCommand1();
        invoker.setCommand(command);
        invoker.action();
    }
}
