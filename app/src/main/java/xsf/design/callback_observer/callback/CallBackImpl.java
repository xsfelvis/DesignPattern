package xsf.design.callback_observer.callback;

/**
 * Author: xushangfei
 * Time: created at 2017/4/30.
 * Description:
 */

public class CallBackImpl implements ICallBack {
    @Override
    public void onCall() {
        System.out.println("回调函数");
    }
}
