package xsf.design.proxy.staticProxy;

/**
 * Author: 彩笔学长
 * Time: created at 06/12/2016.
 * Description:
 */

public class Lawyer implements ILawsuit {
    private ILawsuit lawsuit;//持有一个具体被代理者的引用

    public Lawyer(ILawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }

    @Override
    public void submit() {
        lawsuit.submit();
    }

    @Override
    public void burden() {
        lawsuit.burden();
    }

    @Override
    public void defend() {
        lawsuit.defend();
    }

    @Override
    public void finish() {
        lawsuit.finish();
    }
}
