package com.vi.JZ;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class JZ19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null)
            return null;
        // y轴长度
        int y = matrix.length;
        // x轴长度
        int x = matrix[0].length;
        // 指向y轴坐标
        int i = 0;
        // 指向x轴坐标
        int j = 0;
        // 存放数字的容器
        ArrayList<Integer> list = new ArrayList<>();
        // 碰触到边缘的次数，0:i不变，j递增;1:j不变，i递增;2:i不变,j递减；3：j不变，i递减
        int count = 0;
        int step = 0;

        while (list.size() < x * y) {
            if (count == 0) {
                while (j < x - step) {
                    list.add(matrix[i][j]);
                    j++;
                }
                i++;    // 坐标下移一位
                j--;    // 防止数组越界
                count = 1;
                continue;
            }
            if (count == 1) {
                while (i < y - step) {
                    list.add(matrix[i][j]);
                    i++;
                }
                j--;    // 坐标左移一位
                i--;    // 防止数组越界
                count = 2;
                continue;
            }
            if (count == 2) {
                while (j >= step) {
                    list.add(matrix[i][j]);
                    j--;
                }
                i--; // 坐标上移一位
                j++; // 防止数组越界
                count = 3;
                step++; // 边界缩小一次
                continue;
            }
            if (count == 3) {
                while (i >= step) {
                    list.add(matrix[i][j]);
                    i--;
                }
                j++; // 坐标右移一位
                i++; // 防止数组越界
                count = 0;
                continue;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        JZ19 jz = new JZ19();
//        int[][] arr = new int[][]{{1, 2, 3,4}, { 5, 6,7,8},{9,10,11,12}};
        int[][] arr = new int[][]{{1}, {2}, {3}, {4}, {5}};
        System.out.println(jz.printMatrix(arr));
    }
}
