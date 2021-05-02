package Sun_0502.homework10;

import java.util.Objects;

public class Doctor{

    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
    //判斷兩個比較對象是否相同
        if(this == obj) return true;
        //判斷obj 是否是 Doctor類型或其子類
        //過關斬將 校驗方法:先寫出正確情況，再取反
        if(!(obj instanceof Doctor)) {
            return false;
            //如果obj的運行類型不是指向doctor或其子類型就false，是的話接下來就可以向下轉型
        }
        Doctor doctor = (Doctor)obj; //比較5個屬性都相同，才回傳true，否則false
        return this.name.equals(doctor.name) && this.age == doctor.age &&
                this.gender == doctor.gender && this.job.equals(doctor.job) &&
                this.sal == doctor.sal;
    }

}
