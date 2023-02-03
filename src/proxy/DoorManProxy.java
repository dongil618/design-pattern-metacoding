package proxy;

public class DoorManProxy extends DoorMan {

    public void 쫓아내(Animal a) {
        System.out.println("안녕ㅎㅎ");
        super.쫓아내(a);
    }
}
