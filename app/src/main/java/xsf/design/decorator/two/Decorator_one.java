package xsf.design.decorator.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class Decorator_one extends Decorator {
    public Decorator_one(IHuman human) {
        super(human);
    }

    public void goHome() {
        System.out.println("进房子。。");
    }

    public void findMap() {
        System.out.println("书房找找Map。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }
}
