package Sat_0508;

import java.util.*;

@SuppressWarnings({"all"})
public class Generic_ {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack", 20));
        students.add(new Student("tom", 28));
        students.add(new Student("white", 56));

        for (Student stu:students) {
            System.out.println(stu);
        }

        System.out.println("============= HashMap 方式 =============");
        HashMap<String, Student> hm = new HashMap<String, Student>();
        hm.put("tom", new Student("tom", 22));
        hm.put("mary", new Student("mary", 26));
        hm.put("sure", new Student("sure", 21));

        //迭代器  這種方法現在還看不懂 。。。
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }

    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}