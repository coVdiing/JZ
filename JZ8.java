package com.vi.JZ;

import com.vi.test.JumpFloor;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JZ8 {
    private Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(new JZ8().JumpFloorII(4));
    }

    public int JumpFloorII(int target) {
        if (map.containsKey(target)) {
            return map.get(target);
        } else {
            int result = 0;
            for (int i = target-1; i >= 1; i--) {
                result += JumpFloorII(i);
            }
            map.put(target, result+1);
            return map.get(target);
        }
    }

    public JZ8() {
        map.put(1, 1);
        map.put(2, 2);
    }
}
