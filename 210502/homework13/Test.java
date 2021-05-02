package Sun_0502.homework13;

public class Test {
    public static void main(String[] args) {

        Person[] persons = new Person[4];
        persons[0] = new Student("jack", '男', 18, 1036);
        persons[1] = new Student("kitty", '女', 16, 1022);
        persons[2] = new Teacher("white", '男', 56, 33);
        persons[3] = new Teacher("scott", '男', 36, 7);

        persons[0].printInfo();
        persons[3].printInfo();

        Person temp = persons[0]; //年齡從大到小排序
        for (int i = 0; i < persons.length - 1; i++) { //判斷的是年齡大小，交換的是物件本身
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }

        System.out.println("========= 年齡從大到小排序 ===========");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        Test test = new Test();
        System.out.println("===== 遍歷arr，調用call動態綁定方法 ======");
        for (int i = 0; i < persons.length; i++) {
            test.call(persons[i]);
        }
    }

    public void call(Person p) { //向下轉型 類型判斷
        if (p instanceof Student) {
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("do nothing :)");
        }


    }

}
