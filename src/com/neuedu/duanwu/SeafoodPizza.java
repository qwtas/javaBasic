package com.neuedu.duanwu;
public class SeafoodPizza extends Pizza {

    private String peiLiao;


    public String getPeiliao() {
        return peiLiao;
    }
    public void setPeiliao(String peiliao) {
        this.peiLiao = peiLiao;
    }

    public SeafoodPizza() {//无参构造
        super();
    }

    public SeafoodPizza(int size, int price, String name, String peiLiao) {
        super(size, price, name);
        this.peiLiao = peiLiao;
    }


    public String show(){
        return "名称:"+super.getName()+"\n价格:"+super.getPrice()+"元"+"\n大小:"+super.getSize()+"寸"+"\n配料:"+peiLiao;
    }


}