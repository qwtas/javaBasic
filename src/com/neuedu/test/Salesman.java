package com.neuedu.test;

public class Salesman {
    private String name;
    private String sex;
    private String date;
    private float basic;
    private float exsalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getBasic() {
        return basic;
    }

    public void setBasic(float basic) {
        this.basic = basic;
    }

    public float getExsalary() {
        return exsalary;
    }

    public void setExsalary(float exsalary) {
        this.exsalary = exsalary;
    }
    public void computeSalary(){
        System.out.println(basic+exsalary);
    }
}
