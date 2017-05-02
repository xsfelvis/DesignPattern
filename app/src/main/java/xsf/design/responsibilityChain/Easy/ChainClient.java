package xsf.design.responsibilityChain.Easy;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/19.
 * Description:
 */

public class ChainClient {
    public static void main(String[] args) {
        ConcreateHanlderOne handlerOne = new ConcreateHanlderOne();
        ConcreateHandlerTwo handlerTwo = new ConcreateHandlerTwo();
        handlerOne.successor = handlerTwo;
        handlerOne.handleRequest("HandlerTwo");
    }
}
