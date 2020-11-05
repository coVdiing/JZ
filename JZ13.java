package com.vi.JZ;

import java.util.ArrayList;

/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class JZ13 {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> odd = new ArrayList<>(16);
        ArrayList<Integer> even = new ArrayList<>(16);
        for (int value : array) {
            if (value % 2 == 0)
                even.add(value);
            else
                odd.add(value);
        }
        odd.addAll(even);
        int index = 0;
        for (Integer element : odd) {
           array[index++] = element;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,8,9,0};
        JZ13 jz = new JZ13();
        jz.reOrderArray(arr);
    }
}
