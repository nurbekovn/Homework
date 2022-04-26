package com.company;

public class Return {
    public static String main(String[] args) {
        method(10);
        return "четное";
    }
    static void method(int a) {
        if (a % 2 == 0){
            System.out.println(a);
        }else System.out.println(a);
    }
}
