package xsf.design.Factory.one;

/**
 * Author: 彩笔学长
 * Time: created at 16/11/2016.
 */

/*
 * 抽象工厂方法
 * 具体交由子类实现
 */
public abstract class Factory {
    //public abstract Product createProduct();
    //使用抽象类
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
