package xsf.design.factory.normal;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:抽象工厂
 */

public abstract class Creator {
    //创建一个产品对象
    public abstract <T extends Product> T createProduct(Class<T> c);
}
