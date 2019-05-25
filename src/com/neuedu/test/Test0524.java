package com.neuedu.test;

import java.util.Scanner;

public class Test0524 {
   // public static void main(String[] args) {
        /*int x = 0;        //定义水仙花数的个数
        for(int i=100;i<=999;i++){
            int b = i/100;        //取得百位数
            int s = (i-100*b)/10;        //取得十位数
            int g = (i-s*10-b*100);        //取得个位数

            if(i==g*g*g+s*s*s+b*b*b){
                x++;    //每次符合水仙花数条件，则x+1;
                System.out.print(i+" ");    //输出符合条件的数
            }
        }System.out.println();        //换行
        System.out.println("水仙花数总共有"+x+"个");    //输出水仙花数的总数*/


        /*Scanner input =new Scanner(System.in);
        int i = input.nextInt();
        if (i>=90){
            System.out.println("A");
        }
        else if (i<=89&&i>=60){
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }*/


        /*int i = 0;//保存到百位上的数字
        int j = 0;//保存到十位上的数字
        int k = 0;//保存到个位上的数字
        int t = 0;//保存数字的个数
        for(i = 1; i <= 4; i++) {
            for(j = 1; j <= 4; j++) {
                for(k = 1; k <= 4; k++) {
                    if(i != j&& j != k && i!= k) {
                        t += 1;
                        System.out.println(i*100 + j*10 + k);
                    }
                }
            }
        }
        System.out.println("总共能够组成" + t + "个数字！");*/

   /*int i=1*2*3*4*5*6*7*8*9;
        System.out.println(i);*/


     /* int m=0;
      int n=0;
      for (int i=0;i<=100;i++){
          if (i%2!=0){
              m=i+m;
          }
          else{
              n=i+n;
          }
       }
        System.out.println("偶数和等于"+n);
        System.out.println("奇数和等于"+m);*/


       /* Scanner input =new Scanner(System.in);
        int i = input.nextInt();
        int a = i/10000;
        int b = i/1000%10;
        int c = i/100%10;
        int d = i/10%10;
        int e = i%10;
        if (a==e&&b==d){
            System.out.println(i+"为回文数");
        }
        else {
            System.out.println(i+"不是回文数");
        }*/


       /* Scanner input =new Scanner(System.in);
        int i = input.nextInt();
        if (i%4==0&&i%100!=0){
            System.out.println(i+"是闰年");
        }
        else if (i%400==0){
            System.out.println(i+"是世纪闰年");
        }
        else {
            System.out.println(i+"是平年");
        }*/
        public static void main(String[] args) throws Exception{
        char a = (char)System.in.read();
       if (a>='a'&&a<='z'){
            a-=32 ;
             System.out.println(a);
        }else {
            a+=32;
            System.out.println(a);
        }
    }



   /* int i=1;
    int m=0;
    while (i<=200){
       if (i%3==0){
           m+=i;
           i++;
       }
       else {
           i++;
       }

    }
        System.out.println("3的倍数和是"+m);*/

        /*Scanner input =new Scanner(System.in);
        int i = input.nextInt();
        if (i%9==0){
            System.out.println(i+"可以被9整除");
        }
        else {
            System.out.println(i+"不可以被9整除");*/




}
