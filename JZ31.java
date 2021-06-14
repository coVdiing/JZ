package com.vi.JZ;

public class JZ31 {
    public static void main(String[] args) {

    }

    private static int countOne(int n) {
        if (n <= 0) {
            return 0;
        }
        // 定义计数君
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            String target = i + "";
            while (target.contains("1")) {
                counter++;
                int start = target.indexOf("1");
                if (start < target.length() - 1) {
                    target = target.substring(start + 1);
                } else
                    break;
            }
        }
        return counter;
    }
}
