package Fri_0507;

import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Book("book1",77,"happy"));
        list.add(new Book("book2",111,"got it"));
        list.add(new Book("book3",123,"wuhoo"));
        list.add(new Book("book4",36,"miao"));
        list.add(new Book("book5",780,"suki"));
        list.add(new Book("book6",1050,"wahaha"));

        //對集合list進行排序


        //增強for 遍歷輸出
        for (Object o:list) {
            System.out.println(o);
        }

        //使用sort方法
        sort(list);

        System.out.println("======== 價格從小到大 排序後 ======");
        for (Object o:list) {
            System.out.println(o);
        }

    }
    //靜態方法
    public static void sort(List list){
        int listSize = list.size(); //提取出來，放進for就不用反覆調換
        for (int i = 0; i < listSize - 1; i++) { //冒泡
            for (int j = 0; j < listSize - 1 - i; j++) {
                //取出對象book
                Book book1 = (Book) list.get(j); //向下轉型，原本編譯類型是Object
                Book book2 = (Book) list.get(j+1);
                if(book1.getPrice() > book2.getPrice()){ //交換
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }

            }
        }

    }


}


class Book{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名稱：" + name + "\t價格：" + price + "\t作者：" + author;
    }
}