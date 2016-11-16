package xsf.design.Factory;

import xsf.design.Factory.ConcreateFactory;
import xsf.design.Factory.Factory;
import xsf.design.Factory.Product;
import xsf.design.Factory.ProductA;

/**
 * Author: 彩笔学长
 * Time: created at 16/11/2016.
 */

public class TestClient {
    public static void main(String[] args) {
        Factory factory = new ConcreateFactory();
        //Product product = new ProductA();
        Product product = factory.createProduct(ProductA.class);
        product.method();
    }
}
