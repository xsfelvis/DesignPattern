package xsf.design.Proxy.dynicProxy2;

/**
 * Author: 彩笔学长
 * Time: created at 06/12/2016.
 * Description:
 */

public class PersonM implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("老板拖欠工资");
    }

    @Override
    public void burden() {
        System.out.println("合同书和过去一年的银行工资流水");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿!难以反驳");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功，判决老板立即结算工资！");
    }
}
