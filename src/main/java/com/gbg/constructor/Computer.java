package com.gbg.constructor;

/**
 * @Classname Computer
 * @Description TODO
 * @Date 2021/3/17 0017 8:58
 * @Created by Administrator
 */
public class Computer {
    //显示器
    private String displayer;
    //主机
    private String mainUnit;
    //鼠标
    private String mouse;
    //键盘
    private String keyboard;

    public String getDisplayer() {
        return displayer;
    }

    public void setDisplayer(String displayer) {
        this.displayer = displayer;
    }

    public String getMainUnit() {
        return mainUnit;
    }

    public void setMainUnit(String mainUnit) {
        this.mainUnit = mainUnit;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "displayer='" + displayer + '\'' +
                ", mainUnit='" + mainUnit + '\'' +
                ", mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
