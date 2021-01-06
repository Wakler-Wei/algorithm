package com.algorithm.demo.design.factory.achieve.service.impl;

import com.algorithm.demo.design.factory.achieve.entity.AmdMainBoard;
import com.algorithm.demo.design.factory.achieve.entity.MainBoard;
import com.algorithm.demo.design.factory.achieve.service.MainBoardFactory;

/**
 * @author WeiXiang
 * @Description ：
 * @date 2021-01-06
 */
public class AmdMainBoardFactory implements MainBoardFactory {
    @Override
    public MainBoard make() {
        return new AmdMainBoard();
    }
}
