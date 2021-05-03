package Mon_0503;

public class Computer {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Computer.run(phone);
        System.out.println("===============");
        Camera camera = new Camera();
        Computer.run(camera);

    }

    public static void run(USB usb) {
        usb.run();
        usb.close();
    }
}
