package xsf.design.responsibilityChain.normal;

/**
 * Author: xushangfei
 * Time: created at 2017/5/5.
 * Description:
 */

public abstract class ChainHandler {
    private ChainHandler nextChainChandler;

    //每个处理者都必须对请求做出请求
    public final Response handleMessage(Request request) {
        Response response = null;
        if(this.getHandlerLevel().equals(request.getLevel())) {
            //判断是自己级别处理
            response = this.echo(request);
        }else {
            //判断不是自己级别处理
            if(this.nextChainChandler !=null) {
                response = this.nextChainChandler.handleMessage(request);
            }else {
                //处理不了
            }

        }
        return response;

    }

    //设置下一个处理者
    public void setNextHandler(ChainHandler chainHandler){
        this.nextChainChandler = chainHandler;
    }
    //当前handler可以处理的level
    protected abstract Level getHandlerLevel();
    //当前处理者处理的过程
    protected abstract Response echo(Request request);


}
