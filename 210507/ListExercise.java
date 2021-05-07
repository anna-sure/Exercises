package Fri_0507;
/*
List 方法練習
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        for (int i = 0; i < 12; i++) { //增加10個以上的元素
            list.add("hello" + i); //i為編號
        }

        System.out.println("list = " + list);

        list.add(1,"jack");//第二個位置加入元素
        System.out.println("list = " + list);

        System.out.println("獲取第五個元素：" + list.get(4));//獲取第五個元素

        System.out.println("刪除第六個元素："+list.remove(5));//刪除第六個元素

        list.set(6, "david");//修改第七個元素
        System.out.println("list = " + list);


        System.out.println("======== 使用迭代器遍歷 =========");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj = " + obj);

        }


    }

}
