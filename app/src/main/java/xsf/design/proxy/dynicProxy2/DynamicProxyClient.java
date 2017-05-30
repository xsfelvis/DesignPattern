package xsf.design.proxy.dynicProxy2;

/**
 * Author: 彩笔学长
 * Time: created at 06/12/2016.
 * Description:
 */

public class DynamicProxyClient {
    public static void main(String[] args) {
        ILawsuit xiaomin = new PersonM();
        DynamicProxy dynamicProxy = new DynamicProxy();

        ILawsuit lawsuit = (ILawsuit) dynamicProxy.newProxyInstance(xiaomin);
        //代理律师提起诉讼
        lawsuit.submit();
        //代理律师举证
        lawsuit.burden();
        //律师辩护
        lawsuit.defend();
        //完成诉讼
        lawsuit.finish();
    }
}
