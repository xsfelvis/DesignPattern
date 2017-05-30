package xsf.design.abstractFactory;

/**
 * Author: 彩笔学长
 * Time: created at 16/11/2016.
 */

public class BMWFactroy extends CarFactory{
    @Override
    public ITire createTire() {
        return new NiuBiTire();
    }

    @Override
    public IEngine createEngine() {
        return new NiubiEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NiuBiBrake();
    }
}
