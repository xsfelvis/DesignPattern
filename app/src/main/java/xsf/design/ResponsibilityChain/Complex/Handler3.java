package xsf.design.ResponsibilityChain.Complex;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/20.
 * Description:
 */

public class Handler3 extends AbstractHandler {
    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Hanlder3 handle request:" + request.getRequestLevel());
    }

    @Override
    protected int getHandleLevel() {
        return 3;
    }
}
