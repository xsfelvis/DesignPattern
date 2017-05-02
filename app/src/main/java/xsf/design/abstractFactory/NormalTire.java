package xsf.design.abstractFactory;

/**
 * Author: 彩笔学长
 * Time: created at 16/11/2016.
 */

public class NormalTire implements  ITire{
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
