package xsf.design.factory.one;

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
