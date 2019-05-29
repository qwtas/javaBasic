package com.neuedu.test;

public class Student {


    public String name;
    public int age;
    public   int score;
//get/set方法

    public void setName(String name1) {
        name = name1;
    }

    public void setAge(int age1) {
        age = age1;
    }

    public void setScore(int score1) {
        score = score1;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "姓名"+name+"成绩"+score;
    }
}
