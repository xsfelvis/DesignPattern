package xsf.design.responsibilityChain.Complex;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/20.
 * Description: 抽象处理类
 */

public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;//下一节点的处理对象

    public final void handleRequest(AbstractRequest request){
        //判断当前处理者处理对象的处理级别是否与请求者的处理级别一致
        if(getHandleLevel()==request.getRequestLevel()){
            handle(request);
        }else {
            //否则将该请求对象转发给下一个节点上的请求对象
            if(nextHandler!=null){
                nextHandler.handleRequest(request);
            }else {
                //当所有请求者对象不能处理该请求时输出
                System.out.println("All of handler can not handle the request");
            }
        }
    }

    protected abstract void handle(AbstractRequest request);

    protected abstract int getHandleLevel();

}
