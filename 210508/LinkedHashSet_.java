package Sat_0508;

import java.util.LinkedHashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class LinkedHashSet_ {
    public static void main(String[] args) {

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("BMW", 100000000));
        linkedHashSet.add(new Car("audi", 20000000));
        linkedHashSet.add(new Car("benz", 300000000));
        linkedHashSet.add(new Car("BMW", 100000000));
        linkedHashSet.add(new Car("kicks", 90000000));
        //默認情況下，BMW是new出的兩個不同對象，hashcode不同，是可以添加進去的
        //題目要求，如果名稱和價格相同，則認為是同一樣事物，不能重複添加
        //所以就要重寫hashcode和equals方法：
        //當名稱和價格形同，override成返回相同的hashcode值，並且equals返回true
        System.out.println("LinkesHashSet = "+linkedHashSet);


    }
}

class Car{

    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //重寫hashcode和equals，重寫後前面的第二個相同名字和價格的BMW就添加失敗

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}