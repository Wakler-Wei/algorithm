package com.algorithm.demo.design.factory.achieve.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author WeiXiang
 * @Description ：
 * @date 2021-01-06
 */
public class IntelCPU extends CPU {


    public static void main(String[] args) {

        List<HashMap<String, String>> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        map.put("loginName", "123");
        map.put("userName", "nake");
        map.put("userId", "1");
        list.add(map);
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("loginName", "2312313");
        map2.put("userName", "nake");
        map2.put("userId", "11");
        list.add(map2);
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("loginName", "233");
        map3.put("userName", "nake");
        map3.put("userId", "111");
        list.add(map3);

        List<String> ids = list.stream().map(item -> item.get("userId")).collect(Collectors.toList());
        //外部输入
        String id = "1";
        //是否存在
        boolean contains = ids.contains(id);

        System.out.println(ids);
        System.out.println(contains);

    }


}
