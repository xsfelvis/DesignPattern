package xsf.reflect;

/**
 * Author: xushangfei
 * Time: created at 2017/5/30.
 * Description:
 */

public class SuperMan extends Man implements Ifly {

    private boolean BlueBriefs;

    public void walk() {
        System.out.println("超人也会走");
    }

    public boolean isBlueBriefs() {
        return BlueBriefs;
    }

    public void setBlueBriefs(boolean blueBriefs) {
        BlueBriefs = blueBriefs;
    }

    @Override
    public void fly(int m) {
        System.out.println("superman fly " + m + "米远");
    }
}
