package xsf.design.decorator.one;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class Lettuce extends Condiment {

    Humburger humburger;

    public Lettuce(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName()+" 加生菜";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice()+1.5;
    }
}
