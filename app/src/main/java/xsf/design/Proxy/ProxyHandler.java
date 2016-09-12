package xsf.design.Proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * Author: hzxushangfei
 * Time: created at 2016/9/12.
 * Copyright 2016 Netease. All rights reserved.
 */
public class ProxyHandler implements InvocationHandler {
    private static final String TAG = ProxyHandler.class.getSimpleName();
    Object targetObject;

    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret;
        Log.i(TAG, "method name:" + method.getName());
        ret = method.invoke(targetObject,args);
        return ret;
    }
}
