package xsf.design.Singleton;

/**
 * Author: 彩笔学长
 * Time: created at 18/11/2016.
 * Description:双重检测单例
 */

public class DCSingleton {
    private volatile  static  DCSingleton instance = null;

    public DCSingleton() {
    }
    public static DCSingleton getInstance(){
        if(instance==null){
            synchronized (DCSingleton.class){
                if(instance==null){
                    instance = new DCSingleton();
                }
            }

        }
        return  instance;
    }

}
