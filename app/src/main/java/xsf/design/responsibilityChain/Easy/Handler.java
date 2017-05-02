package xsf.design.responsibilityChain.Easy;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/19.
 * Description: 抽象处理类
 */

public abstract class Handler {
    protected Handler successor;//下一节点的处理者

    public abstract void handleRequest(String condition);
}
