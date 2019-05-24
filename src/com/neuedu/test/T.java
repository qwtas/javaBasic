package com.neuedu.test;

public class T {
    public static void main(String[] args) {
        int i = 5692324;
        int m ;
        while (i != 0) {
            m =i%10;
            System.out.print(m);
            i = i/10;
        }
    }
}
