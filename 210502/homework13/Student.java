package Sun_0502.homework13;

public class Student extends Person{

    private int stu_id;

    public Student(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("我承諾，會好好學習。");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public void printInfo() {
        System.out.println("======== Student's Information ========");
        super.printInfo();
        System.out.println("stu_id: "+stu_id);
        study();
        System.out.println("Student "+play());//返回的是string，需要列印出來，不能直接調用
    }
}
