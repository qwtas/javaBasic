package com.neuedu.work0613;

import java.util.HashMap;
import java.util.Map;

public class Test03 {

    /*现在有一个map集合如下：

    Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

    要求：

            1.遍历集合，并将序号与对应人名打印。

            2.向该map集合中插入一个编码为5姓名为李晓红的信息

       3.移除该map中的编号为1的信息

       4.将map集合中编号为2的姓名信息修改为"周林"

*/
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

//          遍历集合
        for (Integer in : map.keySet()) {
                         //map.keySet()返回的是所有key的值
                         String str = map.get(in);//得到每个key多对用value的值
                         System.out.println(in + "" + str);
                    }

//          插入信息
        map.put(5,"李晓红");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

//        移除1
        map.remove(1);
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

//      修改信息
        map.put(2,"周林");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}
