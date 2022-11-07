package Chepter3;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println("객체생성 횟수 : " + Static.count);
        Static a = new Static();

        System.out.println("객체생성 횟수 : " + a.getNum());
        Static a2 = new Static();

        System.out.println("객체생성 횟수 : " + a2.getNum());
        System.out.println("최종 객체생성 횟수 : " + Static.count);

    }
}
