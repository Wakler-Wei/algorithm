package com.algorithm.demo.shellSort;

/**
 * @description: 希尔排序
 * @author: xiangyang
 * @time: 2020/8/31
 *
 * 把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；
 * 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至 1 时，
 * 整个文件恰被分成一组，算法便终止。
 *
 * 从实质上来说是一种改良后的插入算法，通过比较分组后组外的数，使一个数能够跨越过多个数实现插入，
 * 即一次插入可以消除多个元素值的交互，这一点其实是通过冒泡法来说的 算法先将要排序的一组数按某个增量d分成若干组，
 * 每组中记录的下标相差d.对每组中全部元素进行排序，然后再用一个较小的增量对它进行，在每组中再进行排序。
 * 当增量减到1时，整个要排序的数被分成一组，排序完成.
 */
public class ShellSort {

    public static void ShellSort(){
        int[] array={49,38,65,97,76,13,27,49,78,34,12,64,1};
        System.out.println("排序之前：");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        //希尔排序
        int length = array.length;
        while (true){
            length /= 2;//增量每次减半
            for (int i = 0; i < length; i++) {
                for (int j = i + length; j < array.length; j += length) {//这个循环里其实就是一个插入排序
                    int temp = array[j];
                    int k = j - length;
                    while (k >= 0 && array[k] > temp) {
                        array[k + length] = array[k];
                        k -= length;
                    }
                    array[k + length] = temp;
                }
            }
            if (length == 1)
                break;
        }

        System.out.println();
        System.out.println("排序之后：");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
