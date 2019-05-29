package com.neuedu.test;

import java.util.Scanner;

public class Student02 {

    String sno;
    String name;

    public void Run() {
        double avg = 0;
        for (int i = 0; i < 5; i++) {
            Scanner stu1 = new Scanner(System.in);
            System.out.print("请输入学生的学号:");
            sno = stu1.next();

            Scanner stu2 = new Scanner(System.in);
            System.out.print("请输入学生的姓名:");
            name = stu2.next();

            Scanner stu3 = new Scanner(System.in);
            System.out.println("请输入学生的成绩:");
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = stu3.nextInt();//给数组for循环键盘录入值;
            }
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
                avg = sum / 3;
            }
            System.out.println(name + "的学号为：" + sno);
            System.out.println("三科的平均成绩为：" + avg);
            System.out.println();
        }

    }

}
