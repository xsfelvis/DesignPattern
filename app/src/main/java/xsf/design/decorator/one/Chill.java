package xsf.design.decorator.one;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class Chill extends Condiment {
    Humburger humburger;

    public Chill(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName()+" 加辣椒";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice();  //辣椒是免费的哦
    }
}
