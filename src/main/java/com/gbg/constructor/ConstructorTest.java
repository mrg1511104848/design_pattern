package com.gbg.constructor;

/**
 * @Classname ConstructorTest
 * @Description TODO
 * @Date 2021/3/17 0017 9:02
 * @Created by Administrator
 */
public class ConstructorTest {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.installDisplayer("显示器");
        computerBuilder.installKeyboard("键盘");
        computerBuilder.installMainUnit("主机");
        computerBuilder.installMouse("鼠标");
        Computer computer = computerBuilder.getComputer();
        System.out.println(computer);
    }
}
