package com.algorithm.demo.design.builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author WeiXiang
 * @Description ：
 * @date 2021-01-06
 */
@Builder
@Data
public class Consumer {

    private String name;
    private String password;
    private String nickName;
    private int age;
}
