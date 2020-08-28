package com.algorithm.demo.bisectionAlgorithm;

/**
 * @description: 二分算法
 * @author: Weixiang
 * @time: 2020/8/28
 */
import lombok.extern.slf4j.Slf4j;

/**
 * 又叫折半查找，要求待查找的序列有序。每次取中间位置的值与待查关键字比较，如果中间位置 的值比待查关键字大，则在前半部分循环这个查找的过程，如果中间位置的值比待查关键字小，
 * 则在后半部分循环这个查找的过程。直到查找到了为止，否则序列中没有待查的关键字。
 */
@Slf4j
public class BisectionAlgorithm {

  public static int biSearch(int[] array, int a) {
    int arrayStart = 0;
    int arrayEnd = array.length - 1;
    int mid;
    int count = 0;
    while (arrayStart <= arrayEnd) {
      count++;
      mid = (arrayStart + arrayEnd) / 2; // 中间位置
      if (array[mid] == a) {
        return mid + 1; //返回数字index
      } else if (array[mid] < a) { // 向右查找
        arrayStart = mid + 1;
      } else { // 向左查找
        arrayEnd = mid - 1;
      }
    }
    log.debug("查找次数：" , count);
    return -1;
  }

}
