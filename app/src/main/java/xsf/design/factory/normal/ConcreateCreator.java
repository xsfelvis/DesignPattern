package xsf.design.factory.normal;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class ConcreateCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
