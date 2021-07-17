package Extends;
//模拟小学生考试的情况
public class Pupil {
    public String name;
    public int age;
    private double score;

    //set score
    public void setScore(double score) {
        this.score = score;
    }

    //写个考试的方法
    public void testing(){
        System.out.println("Student " + name + " is examing maths");
    }

    //考完后 成绩show
    public void showInfo(){
        System.out.println("Student " + name + " age is " + age + " score is " + score);
    }
}
