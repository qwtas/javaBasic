package com.neuedu.test;

public class Calculator {
    private int iFirstNum;
    private int iSecondNum;

    public Calculator(int iFirst, int iSecond){
        this.iFirstNum = iFirst;
        this.iSecondNum = iSecond;
    }

    public int getAdd(){
        return this.iFirstNum + this.iSecondNum;
    }

    public int getSub(){
        return this.iFirstNum - this.iSecondNum;
    }

    public int getMul(){
        return this.iFirstNum * this.iSecondNum;
    }

    public void getDev(){
        if(this.iSecondNum ==0){
            System.out.print("分子不能为零！");
        }
        else
        {
            System.out.print(this.iFirstNum/this.iSecondNum);
        }
    }
}
