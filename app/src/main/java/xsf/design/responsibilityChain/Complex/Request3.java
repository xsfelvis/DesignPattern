package xsf.design.responsibilityChain.Complex;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/20.
 * Description:
 */

public class Request3 extends AbstractRequest {
    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }
}
