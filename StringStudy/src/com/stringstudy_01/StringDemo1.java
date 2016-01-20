package com.stringstudy_01;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "Helloworld1233";

        System.out.println(s.length()); // 14
        System.out.println(s.charAt(7)); // r
        System.out.println(s.indexOf('l')); // 2
        System.out.println(s.indexOf("l")); // 2
        System.out.println(s.indexOf("l", 3)); // 3 从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。 
        System.out.println(s.indexOf("ell")); // 1
        System.out.println(s.indexOf('w', 1)); // 5
        System.out.println(s.substring(0, 5)); // hello

        //		int lastIndexOf(String str) ：返回在此字符串中最右边出现的指定子字符串的索引。 
        //		int lastIndexOf(String str, int startIndex) ：从指定的索引处开始向后搜索，返回在此字符串中最后一次出现的指定子字符串的索引。

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);

            if (ch > 'A' && ch < 'Z') {
                bigCount++;
                System.out.print(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else {
                numberCount++;
            }
        }
        System.out.println(bigCount + " " + smallCount + " " + numberCount);
    }
}
