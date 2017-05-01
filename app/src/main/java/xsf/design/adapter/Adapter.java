package xsf.design.adapter;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
