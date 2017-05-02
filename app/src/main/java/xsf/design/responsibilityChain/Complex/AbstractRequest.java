package xsf.design.responsibilityChain.Complex;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/20.
 * Description:
 */

public abstract class AbstractRequest {
    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public abstract int getRequestLevel();
}
