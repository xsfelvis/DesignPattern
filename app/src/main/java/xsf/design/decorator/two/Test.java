package xsf.design.decorator.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class Test {

    public static void main(String[] args) {
        IHuman person = new Person();
        Decorator decorator = new Decorator_two(new Decorator_two(
                new Decorator_one(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
