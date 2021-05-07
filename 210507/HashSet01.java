package Fri_0507;
/*
HashSet的添加元素，底層是如何實現的？
先比較hash(),然後比較equals()->
如果hashcode相同，再比較equals，
如果equals相同，則添加不成功->hashset無法添加相同元素
如果equals不相同，則以鏈表形式添加
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSet01 {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack", 24));
        hashSet.add(new Employee("smith", 30));
        hashSet.add(new Employee("jack", 24));

        System.out.println("hashset = "+hashSet);

        }

    }


class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重寫hash(),如果name和age相同，則返回相同的hash值


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}