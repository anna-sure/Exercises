package Mon_0503;

public class Camera implements USB{

    @Override
    public void run() {
        System.out.println("camera run");
    }

    @Override
    public void close() {
        System.out.println("camera close");
    }
}
