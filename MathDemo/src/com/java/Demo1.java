package com.java;

import java.util.Scanner;

// 调用这个Math.Random()函数能够返回带正号的double值，该值大于等于0.0且小于1.0，即取值范围是[0.0,1.0)的左闭右开区间，返回值是一个伪随机选择的数，在该范围内（近似）均匀分布。
// 在使用Math.Random()的时候需要注意的地方时该函数是返回double类型的值，所以在要赋值给其他类型的变量的时候注意需要进行塑形

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input start number:");
        int startNum = sc.nextInt();
        System.out.println("input end number:");
        int endNum = sc.nextInt();

        for (int i = 0; i < 100; ++i) {
            int num = getRandom(startNum, endNum);
            System.out.println(num);
        }
    }

    public static int getRandom(int start, int end) {
        // 产生从 start 到 end 之间的随机数
        int randNum = (int) (Math.random() * (end - start + 1) + start);
        return randNum;
    }
}
