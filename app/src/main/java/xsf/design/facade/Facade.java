package xsf.design.facade;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class Facade {
    //委托的对象
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    //提供给外部访问的对象
    public void methodA() {
        this.subSystemA.doSomeThingA();
    }

    public void methodB() {
        this.subSystemB.doSomeThingB();
    }
}
