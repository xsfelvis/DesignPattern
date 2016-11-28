package xsf.design.Observer;

import java.util.Observable;

/**
 * Author: 彩笔学长
 * Time: created at 23/11/2016.
 * Description:
 */

public class DevTech extends Observable{
    public void postNewPublication(String content){
        //标志状态或者内容改变
        setChanged();
        //通知观察者
        notifyObservers(content);
    }
}
