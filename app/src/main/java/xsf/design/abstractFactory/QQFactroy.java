package xsf.design.abstractFactory;

/**
 * Author: 彩笔学长
 * Time: created at 16/11/2016.
 */

public class QQFactroy extends CarFactory{
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new NormalEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
