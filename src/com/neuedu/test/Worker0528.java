package com.neuedu.test;

public class Worker0528 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setName("zhangsan");
        worker.setNum(22);
        worker.setSalary(200);
        worker.computeSalary();

        Salesman s1 = new Salesman();
        s1.setBasic(2600);
        s1.setName("lisi");
        s1.setExsalary(800);
        s1.computeSalary();

        Floater f1 = new Floater();
        f1.setName("xiaoma");
        f1.setNum(22);
        f1.setSalary(20);
        f1.setHour(10);
        f1.computeSalary();

        Manager m1 = new Manager();
        m1.setName("xiaofeng");
        m1.computeSalary();



}
}