package com.neuedu.Test03;

public class Notebook {
    private char    color;
    private int     cpu;
    //无参
    public Notebook(){
        color='黑';
        cpu=002;
    }
    //有参
    public Notebook(char    color,int   cpu){
        this.color=color;
        this.cpu=cpu;
    }

    @Override
    public String toString() {
        return "颜色为："+color+"  "+"cpu型号为："+cpu;
    }

}
