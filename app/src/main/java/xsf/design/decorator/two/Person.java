package xsf.design.decorator.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class Person implements IHuman {
    @Override
    public void wearClothes() {
        System.out.println("穿什么呢。。");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里呢。。");
    }
}
