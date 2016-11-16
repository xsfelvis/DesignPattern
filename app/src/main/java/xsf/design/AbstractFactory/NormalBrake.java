package xsf.design.AbstractFactory;

/**
 * Author: 彩笔学长
 * Time: created at 16/11/2016.
 */

public class NormalBrake implements IBrake{
    @Override
    public void brake() {
        System.out.println("一般般刹车系统");
    }
}
