package Sat_0501.encap.polyparameter;

public class Test {
    public static void main(String[] args) {

        Worker jack = new Worker("jack", 3000);
        Manager david = new Manager("david", 15000);

        Test test = new Test();
        test.showEmployeeAnnual(jack);
        test.showEmployeeAnnual(david);

        test.testWork(jack);
        test.testWork(david);

    }

    public void showEmployeeAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {

        }
    }

}
