package com.gbg.constructor;

/**
 * @Classname ComputerBuilder
 * @Description 构建者设计模式
 * @Date 2021/3/17 0017 9:00
 * @Created by Administrator
 */
public class ComputerBuilder {
    private Computer computer = new Computer();

    public void installDisplayer(String displayer) {
        computer.setDisplayer(displayer);
    }

    public void installMainUnit(String mainUnit) {
        computer.setMainUnit(mainUnit);
    }

    public void installMouse(String mouse) {
        computer.setMouse(mouse);
    }

    public void installKeyboard(String keyboard) {
        computer.setKeyboard(keyboard);
    }

    public Computer getComputer() {
        return computer;
    }
}
