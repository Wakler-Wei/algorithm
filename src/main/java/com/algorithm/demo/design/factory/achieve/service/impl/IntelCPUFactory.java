package com.algorithm.demo.design.factory.achieve.service.impl;

import com.algorithm.demo.design.factory.achieve.entity.CPU;
import com.algorithm.demo.design.factory.achieve.entity.IntelCPU;
import com.algorithm.demo.design.factory.achieve.service.CPUFactory;

/**
 * @author WeiXiang
 * @Description ：
 * @date 2021-01-06
 */
public class IntelCPUFactory implements CPUFactory {
    @Override
    public CPU make() {
        return new IntelCPU();
    }
}
