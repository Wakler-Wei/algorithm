package com.algorithm.demo.design.factory.simple;

import com.algorithm.demo.design.factory.entity.Food;
import com.algorithm.demo.design.factory.simple.entity.HuangMenChicken;
import com.algorithm.demo.design.factory.simple.entity.LanZhouNoodle;

/**
 * @author WeiXiang
 * date 2020-12-30
 * @Description ：简单工厂模式
 */
public class SimpleFoodFactory {


    public static Food makeFood(String name) {
        if (name.equals("noodle")) {
            Food noodle = new LanZhouNoodle();
            noodle.setSpicy("more");
            return noodle;
        } else if (name.equals("chicken")) {
            Food chicken = new HuangMenChicken();
            chicken.setCondiment("potato");
            return chicken;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Food chicken = SimpleFoodFactory.makeFood("chicken");
        assert chicken != null;
        System.out.println("Condiment:" + chicken.getCondiment() + "\nSpicy:" +chicken.getSpicy());
    }
}
