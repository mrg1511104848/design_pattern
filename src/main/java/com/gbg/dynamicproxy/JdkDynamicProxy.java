package com.gbg.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname JdkDynamicProxy
 * @Description TODO
 * @Date 2021/3/17 0017 21:41
 * @Created by Administrator
 */
public class JdkDynamicProxy implements InvocationHandler {
    private Person person;

    public JdkDynamicProxy(Person person) {
        this.person = person;
    }

    public Object getTarget() {
        Object proxyInstance = Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), this);
        return proxyInstance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置增强");
        Object invoke = method.invoke(person, args);
        System.out.println("后置增强");
        return invoke;
    }
}
