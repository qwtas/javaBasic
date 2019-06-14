package com.neuedu.work0613;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 4.产生10个1-100的随机数，并放到一个数组中
   把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 */
public class Test01 {

    /*产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。*/
    public static void main(String[] args) throws IOException {
        int[] arr = getArr();
        System.out.println();
        getList(arr);
        System.out.println();

    }

    // 产生10个随机数
    /*
     * 要产生随机数，可以使用Java api中java.lang包中的Math类.Math类以静态方法的方式提供常用的数学方法，
     * 其中Math.random()方法是一个可以产生[0.0,1.0]区间内的一个双精度浮点数的方法 如: 产生一个100以内的整数:int
     * x=(int)(Math.random()*100); 又如: 产生一个1-50之间的随机数:int
     * x=1+(int)(Math.random()*50)
     */
    public static int[] getArr() {
        int[] numArr = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = 1 + (int) (Math.random() * 100);
            numArr[i] = num;
        }
        System.out.println("产生的随机数数组为：");
        for (int i = 0; i < 10; i++) {
            System.out.print(numArr[i] + " ");
        }
        return numArr;
    }

    // 把数组中大于10的数放到一个ArrayList集合中
    public static void getList(int[] numArr) {
        // 创建一个集合，用来保存大于10的数
        ArrayList<Integer> numList = new ArrayList<Integer>();
        // 给集合添加元素
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] < 10) {
                continue;
            } else {
                numList.add(numArr[i]);
            }
        }
        // 把集合中的元素打印到控制台
        System.out.println("集合中的元素为：");
        for (Integer i : numList) {
            System.out.print(i + " ");
        }
    }



}
