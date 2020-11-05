package com.vi.JZ;

/**
 * 题目描述
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 */
public class JZ11 {
    public static void main(String[] args) {
        JZ11 jz = new JZ11();
        int number = jz.NumberOf1(-10);
        System.out.println(number);
    }

    public int NumberOf1(int n) {
        int number = 0;
        String target = Integer.toBinaryString(n);
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == '1') {
                number++;
            }
        }
        return number;
    }
}
