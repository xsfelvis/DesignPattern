package xsf.design.AbstractFactory;

/**
 * Author: 彩笔学长
 * Time: created at 16/11/2016.
 */

public abstract class CarFactory {
    //抽象生产轮胎
    public abstract ITire createTire();
    //抽象生产发动机
    public abstract IEngine createEngine();
    //抽象生产刹车系统
    public abstract IBrake  createBrake();
}
