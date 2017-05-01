package xsf.design.decorator.one;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class ChickenBurger extends Humburger{

    public ChickenBurger(){
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
