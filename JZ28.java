package com.vi.JZ;

import java.util.Arrays;

/**
 * 找出数组中出现超过一半的数字
 */
public class JZ28 {
    public static void main(String[] args) {
        int[] arr ={2,2,2,2,2,1,3,4,5};
        System.out.println(MoreThanHalfNum_Solution2(arr));
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < array.length ;i++) {
            sb.append(array[i]);
        }
        String target = sb.toString().charAt(array.length/2)+"";
        String str = sb.toString();
        if((str.lastIndexOf(target)-str.indexOf(target)+1) >= array.length/2) {
            return Integer.parseInt(target);
        }
        return 0;
    }

    public static int MoreThanHalfNum_Solution2(int [] array) {
        int win = 0;
        int count = 0;
        for(int i = 0;i < array.length;i++) {
            if(count == 0) {
                win = array[i];
                count++;
            } else {
                if(win == array[i]) {
                    count++;
                } else
                    count--;
            }
        }
        count = 0;
        for(int i = 0;i < array.length;i++ ) {
            if(win == array[i] ) {
                count++;
            }
        }
        if(count > array.length/2)
            return win;
        return 0;
    }
}
