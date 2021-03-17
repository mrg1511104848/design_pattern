package com.gbg.simplefactory;

/**
 * @Classname SimpleFactoryTest
 * @Description TODO
 * @Date 2021/3/17 0017 9:02
 * @Created by Administrator
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer hp = computerFactory.createComputer("lenovo");
        hp.start();
    }
}
