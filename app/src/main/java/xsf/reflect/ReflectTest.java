package xsf.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Author: xushangfei
 * Time: created at 2017/5/30.
 * Description:
 */

public class ReflectTest {

    public static void main(String[] args) {
        Demo1();
        System.out.println("==============================");
        Demo2();
        System.out.println("==============================");
        Demo3();
        System.out.println("==============================");
        Demo4();
        System.out.println("==============================");
        Demo5();
        System.out.println("==============================");
        Demo6();
        System.out.println("==============================");
        Demo7();
        System.out.println("==============================");
        Demo8();
        System.out.println("==============================");
    }

    /**
     * 获取类加载器信息
     * 1）Bootstrap ClassLoader 此加载器采用c++编写，一般开发中很少见。

     * 2）Extension ClassLoader 用来进行扩展类的加载，一般对应的是jre\lib\ext目录中的类

     * 3）AppClassLoader 加载classpath指定的类，是最常用的加载器。同时也是java中默认的加载器。
     */
    private static void Demo8() {
        Class<?> class1 = null;
        try {
            class1 = Class.forName("xsf.reflect.SuperMan");
            String nameString = class1.getClassLoader().getClass().getName();

            System.out.println("Demo8: 类加载器类名: " + nameString);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 通过反射调用类方法
     */
    private static void Demo7() {
        Class<?> class1 = null;
        try {
            class1 = Class.forName("xsf.reflect.SuperMan");
            System.out.println("Demo7: \n调用无参方法fly()：");
            Method method = class1.getMethod("walk");
            method.invoke(class1.newInstance());

            System.out.println("调用有参方法fly(int m)：");
            method = class1.getMethod("fly",int.class);
            method.invoke(class1.newInstance(),100);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    /**
     * 通过java反射机制得到类的一些属性：继承的接口、父类，函数信息，成员信息、类型
     */
    private static void Demo6() {
        Class<?> class1 = null;
        try {
            class1 = Class.forName("xsf.reflect.SuperMan");
            //取得父类名称
            Class<?>  superClass = class1.getSuperclass();
            System.out.println("Demo6:  SuperMan类的父类名: " + superClass.getName());
            //获取属性
            Field[] fields = class1.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println("类中的成员: " + fields[i]);
            }
            //获取类方法
            //取得类方法
            Method[] methods = class1.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println("Demo6,取得SuperMan类的方法：");
                System.out.println("函数名：" + methods[i].getName());
                System.out.println("函数返回类型：" + methods[i].getReturnType());
                System.out.println("函数访问修饰符：" + Modifier.toString(methods[i].getModifiers()));
                System.out.println("函数代码写法： " + methods[i]);
            }
            //获取类接口
            Class<?> interfaces[] = class1.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                System.out.println("实现的接口类名: " + interfaces[i].getName() );
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过java反射机制操作成员变量 set和get
     */
    private static void Demo5() {
        Class<?> class1 = null;
        Object obj = null;
        try {
            class1 = Class.forName("xsf.reflect.Man");
            obj = class1.newInstance();
            Field personNameField = class1.getDeclaredField("name");
            personNameField.setAccessible(true);
            personNameField.set(obj,"elvis先生");
            System.out.println("Demo5: 修改属性之后得到属性变量的值：" + personNameField.get(obj));

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过Java反射机制得到一个类的构造函数，并实现创建带参实例对象
     */
    private static void Demo4() {
        Class<?> class1 = null;
        try {
            class1 = Class.forName("xsf.reflect.Man");
            //由于这里不能带参数，所以你要实例化的这个类Person，一定要有无参构造函数
            Constructor<?>[] constructors = class1.getConstructors();
            Man man = (Man) constructors[0].newInstance();
            //Man man = (Man) class1.newInstance();
            man.setAge(20);
            man.setName("elvis");
            System.out.println("Demo4: " + man.getName() + " : " + man.getAge());

            Man man2 = (Man) constructors[1].newInstance(22, "elvis2");
            System.out.println("Demo4: " + man2.getName() + " : " + man2.getAge());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    /**
     * 通过反射创建类对象
     */
    private static void Demo3() {
        Class<?> class1 = null;
        try {
            class1 = Class.forName("xsf.reflect.Man");
            //由于这里不能带参数，所以你要实例化的这个类Person，一定要有无参构造函数
            Man man = (Man) class1.newInstance();
            man.setAge(20);
            man.setName("elvis");
            System.out.println("Demo3: " + man.getName() + " : " + man.getAge());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

    /**
     * 验证所有类都是Class类的实例对象
     */
    private static void Demo2() {
        //定义两个类型都未知的Class , 设置初值为null, 看看如何给它们赋值成Person类
        Class<?> class1 = null;
        Class<?> class2 = null;

        //写法1, 可能抛出 ClassNotFoundException [多用这个写法]
        try {
            class1 = Class.forName("xsf.reflect.Man");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Demo2:(写法1) 包名: " + class1.getPackage().getName() + "，"
                + "完整类名: " + class1.getName());

        //写法2
        class2 = Man.class;
        System.out.println("Demo2:(写法2) 包名: " + class2.getPackage().getName() + "，"
                + "完整类名: " + class2.getName());

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
