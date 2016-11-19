package xsf.design.Strategy;

/**
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
 */
public class BackDoor implements IStrategy {
    @Override
    public void useStrategy() {
        System.out.println("Use Backdoor: look for qiao help!");
    }
}
