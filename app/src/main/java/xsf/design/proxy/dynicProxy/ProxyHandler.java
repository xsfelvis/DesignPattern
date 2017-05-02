package xsf.design.Proxy.dynicProxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import xsf.design.Util.Constant;

/**
 * 动态代理
 * Author: 彩笔学长
 * Time: created at 2016/9/12.
 */
public class ProxyHandler implements InvocationHandler {

    Object targetObject;

    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret;
        Log.i(Constant.PROXY, "method name:" + method.getName());
        ret = method.invoke(targetObject,args);
        return ret;
    }
}
