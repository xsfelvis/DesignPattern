package xsf.design.callback_observer.callback;

/**
 * Author: xushangfei
 * Time: created at 2017/4/30.
 * Description:
 */

public class TestCallBack {
    private ICallBack callBack;
    public void register(ICallBack callBack) {
        this.callBack = callBack;
    }

    public void call() {
        callBack.onCall();
    }
}
