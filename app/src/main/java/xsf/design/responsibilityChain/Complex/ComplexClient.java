package xsf.design.responsibilityChain.Complex;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/20.
 * Description:
 */

public class ComplexClient {
    public static void main(String[] args) {
        //构造处理者
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();
        //构造链式节点
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;
        //构造请求者
        AbstractRequest request1 = new Request1("Request1");
        AbstractRequest request2 = new Request2("Request2");
        AbstractRequest request3 = new Request3("Request3");

        //从链式首端发起请求
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);

    }
}
