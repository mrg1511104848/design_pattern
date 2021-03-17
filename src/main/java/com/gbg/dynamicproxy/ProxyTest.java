package com.gbg.dynamicproxy;

/**
 * @Classname ConstructorTest
 * @Description TODO
 * @Date 2021/3/17 0017 9:02
 * @Created by Administrator
 */
public class ProxyTest {
    public static void main(String[] args) {
        System.out.println("不用代理类调用dosomething");
        Bob bob = new Bob();
        bob.doSomething();
        System.out.println("-----------------");
        System.out.println("使用代理类调用dosomething");

        Person proxy = (Person) new JdkDynamicProxy(new Bob()).getTarget();
        proxy.doSomething();
    }
}
