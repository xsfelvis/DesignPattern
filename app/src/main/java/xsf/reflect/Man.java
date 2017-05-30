package xsf.reflect;

/**
 * Author: xushangfei
 * Time: created at 2017/5/30.
 * Description:
 */

public class Man {
    private int age;
    private String name;

    public Man() {

    }

    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
