package xsf.design.decorator.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class Decorator implements IHuman {
    private IHuman human;

    public Decorator(IHuman human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
    }
}
