package xsf.design.factory.one;

/**
 * Author: 彩笔学长
 * Time: created at 16/11/2016.
 */
/*
 * 具体工厂实现类
 */
public class ConcreateFactory extends Factory{
    //根据传入的class通过反射取得
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) (Class.forName(clz.getName())).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) product;

    }
    /*@Override
    public Product createProduct() {
        return new ProductA();
    }*/
}
