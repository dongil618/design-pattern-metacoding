package proxy;

public class App {

    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = new DoorManProxy();
        dm.쫓아내(m);
        dm.쫓아내(c);
    }
}