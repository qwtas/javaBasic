package com.neuedu.test;

public class Rectangle {
    //定义长宽属性
    private int width;
    private int height;
    //构造器1
    public Rectangle(){
        this.height = 1;
        this.width = 1;
    }
    //构造器2
    public Rectangle(int index){
        this.width = index;
        this.height = index;
    }
    //构造器3
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    //求周长
    public int getLength(){
        return 2*(this.height+this.width);
    }
    //求面积
    public int getarea(){
        return this.height*this.width;
    }

}
