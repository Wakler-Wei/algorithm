package com.algorithm.demo.arithmetic.choice;

/**
 *
 * @description: 选择排序
 * @author: xiangyang
 * @time: 2020/8/31
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕
 */
public class Choice {

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){//需要比较的次数，数组长度减一
            //先假设每次循环时，最小数的索引为i
            int minIndex = i;
            //每一个元素都和剩下的未排序的元素比较
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){//寻找最小数
                    minIndex = j;//将最小数的索引保存
                }
            }
            //经过一轮循环，就可以找出第一个最小值的索引，然后把最小值放到i的位置
            swap(arr, i, minIndex);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
