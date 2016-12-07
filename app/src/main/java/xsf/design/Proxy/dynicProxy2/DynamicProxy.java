package xsf.design.Proxy.dynicProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author: 彩笔学长
 * Time: created at 06/12/2016.
 * Description:
 */

public class DynamicProxy implements InvocationHandler{
    private Object object;//被引用的代理

    public Object newProxyInstance(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object,args);
        return result;
    }
}
