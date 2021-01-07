package com.algorithm.demo.design.builder;

/**
 * @author WeiXiang
 * @Description ： 建造者模式demo
 * @date 2021-01-06
 */
public class App {
    public static void main(String[] args) {


        User user = User.builder()
                .name("foo")
                .password("pAss12345")
                .age(25)
                .build();

        //@Builder 注解实现建造者模式
        Consumer build = Consumer.builder()
                .name("foo")
                .password("pAss12345")
                .age(25)
                .build();


    }
}
