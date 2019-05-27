package com.neuedu.test;

public class Test0527Calculator02 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculator oCal = new Calculator(6,7);
        System.out.println("两数之和为 ："+oCal.getAdd());
        System.out.println("两数之差为："+oCal.getSub());
        System.out.println("两数之积为："+oCal.getMul());
        System.out.print("两数之商为：");
        oCal.getDev();
    }
}
