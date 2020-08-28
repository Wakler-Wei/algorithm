package com.algorithm.demo.bubbleSort;

/**
 * @description: 冒泡排序
 * @author: Weixiang
 * @time: 2020/8/28
 */

import java.util.Arrays;

/** 比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。 */
public class BubbleSort {

  public static void bubbleSort() {

    int[] arr = new int[] {32, 4, 64, 2, 5, 43, 65, -97, -43, 0, 76, 3, 2, 11};

    // 冒泡排序:比较相邻的两个元素的大小
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) { // j = arr.length - 1
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(arr));
  }

}
