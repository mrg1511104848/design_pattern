package com.gbg.simplefactory;

/**
 * @Classname ComputerFactory
 * @Description TODO
 * @Date 2021/3/17 0017 21:31
 * @Created by Administrator
 */
public class ComputerFactory {
    public Computer createComputer(String type) {
        switch (type) {
            case "hp":
                return new HpComputer();
            case "lenovo":
                return new LenovoComputer();
        }
        return null;
    }
}
