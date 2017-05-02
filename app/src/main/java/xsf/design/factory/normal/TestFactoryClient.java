package xsf.design.factory.normal;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class TestFactoryClient {
    public static void main(String[] args) {
        Creator creator = new ConcreateCreator();
        Product product = creator.createProduct(ConcreateProduct1.class);
        //继续业务处理
    }
}
