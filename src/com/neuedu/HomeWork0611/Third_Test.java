package com.neuedu.HomeWork0611;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Third_Test {
    public static void main(String[] args) {
        List<Third_Email> list = new ArrayList<>();
        list.add(new Third_Email("张三","和平街","石家庄","河北省","中国"));
        list.add(new Third_Email("李四","平安街","酒泉市","甘肃省","中国"));
        list.add(new Third_Email("王五","西大街","青海","青海省","中国"));
        list.add(new Third_Email("赵六","南大街","海南","海南省","中国"));

//        Iterator<Third_Email> i = list.iterator();
//        while(i.hasNext()){
//            Third_Email t = i.next();
//            System.out.println(t.toString());
//        }

        for (Object o:list
             ) {
            System.out.println(o);
        }

    }
}
