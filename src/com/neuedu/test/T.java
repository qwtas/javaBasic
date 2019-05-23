package com.neuedu.test;

public class T {
    public static void main(String[] args) {
        int i = 583;
        int m = 0;
        while (i != 0) {
            m =i%10;
            System.out.print(m);
            i = i/10;
        }
    }
}
