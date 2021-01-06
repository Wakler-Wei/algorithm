package com.algorithm.demo.design.factory.general.service;

import com.algorithm.demo.design.factory.entity.Food;

/**
 * @author WeiXiang
 * @Description ：工厂模式
 * @date 2021-01-06
 */
public interface FoodFactory {

    Food makeFood(String name);
}
