package xsf.design.ResponsibilityChain.Easy;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/19.
 * Description:
 */

public class ConcreateHandlerTwo extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("HandlerTwo")) {
            System.out.println("ConcreateHandlerTwo handled");
        } else {
            successor.handleRequest(condition);
        }


    }
}
