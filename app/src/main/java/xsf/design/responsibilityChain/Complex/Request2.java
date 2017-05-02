package xsf.design.responsibilityChain.Complex;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/20.
 * Description:
 */

public class Request2 extends AbstractRequest {
    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
