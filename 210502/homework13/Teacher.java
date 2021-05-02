package Sun_0502.homework13;

public class Teacher extends Person{

    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承諾，會認真教學。");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    @Override
    public void printInfo() {
        System.out.println("======== Teacher's Information ========");
        super.printInfo();
        System.out.println("work_age: "+work_age);
        this.teach();
        System.out.println("Teacher "+play());
    }
}
