package xsf.design.Proxy.staticProxy;

/**
 * Author: 彩笔学长
 * Time: created at 06/12/2016.
 * Description:
 */

public class StaticProxyClient {
    public static void main(String[] args) {
        ILawsuit xiaomin = new PersonM();
        ILawsuit lawsuit = new Lawyer(xiaomin);
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
