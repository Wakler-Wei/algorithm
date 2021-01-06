package com.algorithm.demo.design.factory.achieve;

import com.algorithm.demo.design.factory.achieve.entity.CPU;
import com.algorithm.demo.design.factory.achieve.entity.Computer;
import com.algorithm.demo.design.factory.achieve.entity.MainBoard;
import com.algorithm.demo.design.factory.achieve.service.impl.AmdMainBoardFactory;
import com.algorithm.demo.design.factory.achieve.service.impl.IntelCPUFactory;

/**
 * @author WeiXiang
 * @Description ：工厂模式分别组合
 * @date 2021-01-06
 */
public class Demo {

    public static void main(String[] args) {


        IntelCPUFactory intelCPUFactory = new IntelCPUFactory();
        CPU intelCPU = intelCPUFactory.make();

        AmdMainBoardFactory amdMainBoardFactory = new AmdMainBoardFactory();
        MainBoard mainBoard = amdMainBoardFactory.make();

        Computer computer = new Computer(intelCPU, mainBoard);


    }
}
