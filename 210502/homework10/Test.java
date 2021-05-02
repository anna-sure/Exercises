package Sun_0502.homework10;

public class Test {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("jack", 30, "doctor", '男', 20000);
        Doctor doctor2= new Doctor("jack", 30, "doctor", '男', 20000);

        System.out.println(doctor.equals(doctor2));

    }

}
