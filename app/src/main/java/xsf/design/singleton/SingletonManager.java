package xsf.design.singleton;

import java.util.Hashtable;
import java.util.Map;

/**
 * Author: 彩笔学长
 * Time: created at 2016/11/18.
 * Description:使用容器实现单例模式
 */

public class SingletonManager {
    private static Map<String,Object> objMap = new Hashtable<>();

    public SingletonManager() {
    }
    public static void registerService(String key,Object instance){
        if(!objMap.containsKey(key)){
            objMap.put(key,instance);
        }
    }
    public static Object getService(String key){
        return objMap.get(key);
    }
}
