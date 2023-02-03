package proxy;

public class DoorManProxy {
    private DoorMan doorMan;

    public DoorManProxy(DoorMan doorMan) {
        this.doorMan = doorMan;
    }
    public void 쫓아내(Animal a) {
        System.out.println("안녕ㅎㅎ");
        doorMan.쫓아내(a);
    }
}
