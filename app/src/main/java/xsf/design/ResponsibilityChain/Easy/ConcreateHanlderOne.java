package xsf.design.ResponsibilityChain.Easy;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/19.
 * Description:
 */

public class ConcreateHanlderOne extends Handler {
    @Override
    public void handleRequest(String condition) {
        if(condition.equals("HandlerOne")){
            System.out.println("ConcreateHandlerOne handled");
            return;
        }else {
            successor.handleRequest(condition);
        }
    }
}
