package xsf.design.factory.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class BlackMan implements IHuman {
    @Override
    public void getColor() {
        System.out.println("黑人皮肤黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }
}
