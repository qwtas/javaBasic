package com.neuedu.test;

import java.util.Scanner;

public class Shape {
 /*   定义一个图形类
      2 创建图形 圆形 正方形 有自己的属性 例如圆形的特征 都有半径 分别定义自己的计算面积和计算周长
      3 创建main方法 进行测试 创建对象 调用方法计算面积和周长*/
 public static void main(String[] args) {
     System.out.println("请输入正方形的边长");
     Scanner side=new Scanner(System.in);
     Square0529 s=new Square0529();
     s.setSide(side.nextDouble());
     s.girth();
     s.area();
     System.out.println();

     System.out.println("请输入圆形的半径");
     Scanner ridus=new Scanner(System.in);
     Circle0529 c=new Circle0529();
     c.setRadius(ridus.nextDouble());
     c.girth();
     c.area();
 }


}
