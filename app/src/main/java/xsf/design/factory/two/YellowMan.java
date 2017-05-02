package xsf.design.factory.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class YellowMan implements IHuman {
    @Override
    public void getColor() {
        System.out.println("黄种人皮肤黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
}
