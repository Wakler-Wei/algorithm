package com.algorithm.demo.design.factory.general.service.impl;

import com.algorithm.demo.design.factory.general.entity.ChineseFoodA;
import com.algorithm.demo.design.factory.general.entity.ChineseFoodB;
import com.algorithm.demo.design.factory.entity.Food;
import com.algorithm.demo.design.factory.general.service.FoodFactory;

/**
 * @author WeiXiang
 * @Description ：
 * @date 2021-01-06
 */
public class ChineseFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new ChineseFoodA();
        } else if (name.equals("B")) {
            return new ChineseFoodB();
        } else {
            return null;
        }
    }
}
