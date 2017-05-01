package xsf.design.adapter;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class ConcreateTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
}
