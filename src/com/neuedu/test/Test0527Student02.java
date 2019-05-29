package com.neuedu.test;

public class Test0527Student02 {
    public static void main(String[] args) {
        Student[] stus = new Student[5];
        for (int i=0;i<stus.length;i++){
           Student student = new Student();
           student.setName("abc");
           student.setScore(80+i);
           stus[i] = student;
        }
        for (int i=0;i<stus.length;i++)
            for (int j = 0; j < stus.length - i; j++) {
                int tmp=0;
                if (stus[j].score>stus[j+1].score) {
                    tmp = stus[j].score;
                    stus[j].score = stus[j+1].score;
                    stus[j+1].score = tmp;
                }
            }
        for (Student s:stus){
            System.out.println(s);
        }


    }
}
