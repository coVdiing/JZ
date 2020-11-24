package com.vi.JZ;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JZ29 {
    public static void main(String[] args) {
        int[] input = {4, 5, 1, 6, 2, 7, 3, 8};
        JZ29 jz = new JZ29();
        jz.GetLeastNumbers_Solution(input, 4);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (input == null || k > input.length)
            return new ArrayList<>();
        Arrays.sort(input);
        ArrayList list = new ArrayList();
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }


}
