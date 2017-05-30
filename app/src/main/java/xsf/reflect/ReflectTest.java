package xsf.reflect;

/**
 * Author: xushangfei
 * Time: created at 2017/5/30.
 * Description:
 */

public class ReflectTest {

    public static void main(String[] args) {
        Demo1();
        System.out.println("==============================");
    }

    /**
     * 通过反射得到类的包名和类名
     */
    private static void Demo1() {
        Man man = new Man();
        System.out.println("Demo1:包名 " + man.getClass().getPackage().getName() + ","
                + "完整类名：" + man.getClass().getName());

    }

}
