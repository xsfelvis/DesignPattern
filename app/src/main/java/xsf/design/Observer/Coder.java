package xsf.design.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Author: 彩笔学长
 * Time: created at 23/11/2016.
 * Description:
 */

public class Coder implements Observer {
    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object data) {
        System.out.println("Hi,"+name+", 内容："+data);
    }

    @Override
    public String toString() {
        return "Coder："+name;
    }
}
