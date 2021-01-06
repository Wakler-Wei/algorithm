package com.algorithm.demo.design.factory.general.service.impl;

import com.algorithm.demo.design.factory.general.entity.AmericanFoodA;
import com.algorithm.demo.design.factory.general.entity.AmericanFoodB;
import com.algorithm.demo.design.factory.entity.Food;
import com.algorithm.demo.design.factory.general.service.FoodFactory;

/**
 * @author WeiXiang
 * @Description ：
 * @date 2021-01-06
 */
public class AmericanFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new AmericanFoodA();
        } else if (name.equals("B")) {
            return new AmericanFoodB();
        } else {
            return null;
        }
    }
}
