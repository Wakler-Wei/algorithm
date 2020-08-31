package com.algorithm.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootTest
class AlgorithmApplicationTests {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Test
    void contextLoads() {
        int array[] = new int[]{1,5,6,3,2};
        int minIndex;
        // 需要选择 len-1 轮
        for (int i = 0; i < array.length - 1; i++) {
            // 初始化每轮最小值下标，取第一位
            minIndex = i;
            // 从未排序位置，开始找最小数
            for (int j = i + 1; j < array.length; j++) {
                if ( array[j] < array[minIndex] ) {
                    // 保存最小数下标，循环结束后交换。
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
        System.err.println(Arrays.toString(array));
    }

}
