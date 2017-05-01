package xsf.design.callback_observer.callback;

/**
 * Author: xushangfei
 * Time: created at 2017/4/30.
 * Description:
 */

public class Test {
    public static void main(String[] args) {
        ICallBack callback = new CallBackImpl();
        TestCallBack a = new TestCallBack();
        a.register(callback);
        a.call();
    }
}
