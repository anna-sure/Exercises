package Mon_0503;

public class Phone implements USB{

    @Override
    public void run() {
        System.out.println("phone run");
    }

    @Override
    public void close() {
        System.out.println("phone close");
    }
}
