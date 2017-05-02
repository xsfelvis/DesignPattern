package xsf.design.responsibilityChain.Complex;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/20.
 * Description:
 */

public class Handler1 extends AbstractHandler {
    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Hanlder1 handle request:"+ request.getRequestLevel());
    }

    @Override
    protected int getHandleLevel() {
        return 1;
    }
}
