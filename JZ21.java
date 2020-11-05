package com.vi.JZ;

import java.util.Stack;

/**
 * 题目描述
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class JZ21 {
    // 思路:通过一个辅助栈，根据pushA进行入栈和出栈的操作，如果最终辅助栈为空，说明出栈操作和入栈操作匹配
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int popAIndex = 0;
        while (index < pushA.length) {
            if (!stack.isEmpty()) {
                // 判断栈顶元素是否和当前出栈元素相同
                if (stack.peek() == popA[popAIndex]) {
                    stack.pop();
                    popAIndex++;
                    continue;
                }
            }
            if (pushA[index] != popA[popAIndex]) {
                stack.push(pushA[index++]);
            } else {
                // 两者相等说明刚入栈又出栈了，这个元素不用压入栈，两个指针都后移一位
                index++;
                popAIndex++;
            }
        }

        while (popAIndex < popA.length) {
            if (stack.peek() == popA[popAIndex]) {
                stack.pop();
            }
            popAIndex++;
        }
        // 出栈和入栈操作完成，判断辅助栈是否为空
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new JZ21().IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{3, 5, 4, 2, 1}));
    }
}
