package com.neuedu.test;

public class Test0527Rectangle02 {
    // TODO Auto-generated method stub
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println("默认长方形的周长为："+rectangle.getLength());
        System.out.println("默认长方形的面积为："+rectangle.getarea());


    Rectangle oRec2 = new Rectangle(2);
        System.out.println("一个参数长方形的周长为："+oRec2.getLength());
        System.out.println("一个参数长方形的面积为："+oRec2.getarea());

    Rectangle oRec3 = new Rectangle(2,3);
        System.out.println("两个参数长方形的周长为："+oRec3.getLength());
        System.out.println("两个参数长方形的面积为："+oRec3.getarea());
}
}