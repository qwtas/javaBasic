package com.neuedu.Test03;

import java.util.Scanner;

public class HomeWork01 {
    //水仙花
//    public static void main(String[] args) {
//        for (int i=100;i<=999;i++){
//            int a=i/100;
//            int b=i%100/10;
//            int c=i%10;
//            if (i==a*a*a+b*b*b+c*c*c){
//                System.out.println(i);
//            }}}
    //成绩
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        int result=input.nextInt();
//        int a=result;
//        if(a>=90){
//            System.out.println("A");
//        }else if(a>=60&&a<90){
//            System.out.println("B");
//        }else {
//            System.out.println("C");
//        }
//    }
    //奇数
//    public static void main(String[] args) {
//       int a=0;
//        for(int i=0;i<=100; i++){
//            if(i%2==0){
//            a=i+a;
//            }
//
//        }
//        System.out.println(a);
//    }
    //偶数
//    public static void main(String[] args) {
//    int a=0;
//        for(int i=1;i<=100; i++){
//            if(i%2!=0){
//                a=i+a;
//            }
//
//        }
//        System.out.println(a);
//    }
    //回文数
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int i = input.nextInt();
//             int a = i / 10000;
//            int b = i % 10000 / 1000;
//            int c=i%1000/100;
//            int d = i % 100 / 10;
//            int e = i % 10;
//            if (i >= 10000 && i <= 99999) {
//                if (a == e && b == d) {
//                    System.out.println("此数是回文数");
//                } else {
//                    System.out.println("不是回文数");
//
//                }
//            }
//    }
    //3的倍数之和
//    public static void main(String[] args) {
//        int num = 0;
//            int i = 1;
//            while (i < 200) {
//                if (i % 3 == 0) {
//
//                    num = i+num;
//                }
//                i++;
//
//            }
//            System.out.println("和为" + num);
//
//    }
//1、2、3、4个数
//    public static void main(String[] args) {
//        int a = 0;
//        int i = 1;
//        for (; (i > 0) && (i < 1000); i++) {
//            int b = i / 100;
//            int c = i % 100 / 10;
//            int d = i % 10;
//            //            System.out.println(a);
//            if (b <= 4 && b > 0 && c <= 4 && c >=1 && d <= 4 && d >=1 && b != c && c != d && b != d) {
//                System.out.println(i);
//                a++;
//                System.out.println(a);
//            }
//        }
//
//        }
    //闰年、平年
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int  i= input.nextInt();
//
//        if(i%4==0&&i%100!=0||i%400==0){
//            System.out.println("闰年");
//        }else{
//            System.out.println("平年");
//        }
//    }
    //计算9
//    public static void main(String[] args) {
//        int a=9;
//        for(int i=1;i<9;i++ ){
//            a=a*i;
//        }
//        System.out.println(a);
//    }
//  输入一个字符
//    public static void main(String[] args) throws Exception {
//
//
//    char a = (char)System.in.read();
//        if (a>='a'&&a<='z'){
//             a-=32 ;
//             System.out.println(a);
//        }else {
////            a+=32;
//            System.out.println(a);
//        }
//    }
    //9整除
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = 0;
        if (a>=0){
            b+= a%10;
            a = a/10;
        }
        b+=a;
        if (b%9==0){
            System.out.println("能被9整除");
        }else {
            System.out.println("不能被9整除");
        }

    }
}
