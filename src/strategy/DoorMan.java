package strategy;

public class DoorMan {

    public void 쫓아내(Animal a) {
        // OCP 위반 -> 기존 코드를 수정했기 때문
        // System.out.println("안녕 ㅎㅎ");
        System.out.println(a.getName() + " 쫓아내");
    }
}
