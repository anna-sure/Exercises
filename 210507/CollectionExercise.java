package Fri_0507;
/*
List 接口的實現子類 Vector LinkedList同樣可以使用下面三種方法遍歷
 */
import java.util.*;

public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {


        List list = new ArrayList();
        list.add(new Dog("旺財",12));//new dog 這邊不需要類別來接收
        list.add(new Dog("汪汪",10));//new dog 這邊不需要類別來接收
        list.add(new Dog("小狗狗",9));//new dog 這邊不需要類別來接收

        //增強for底層本身就是一個迭代器 ***
        System.out.println("====== 使用增強for 遍歷方法一 ===========");
        for (Object dog:list) {
            System.out.println(dog);
        }

        System.out.println("========== 使用迭代器 遍歷方法二 ==========");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {             //while快捷鍵itit
            Object dog =  iterator.next();
            System.out.println(dog);
        }

        System.out.println("========== 使用普通forloop 遍歷方法三 ==========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //list.get獲取對象
        }

    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}