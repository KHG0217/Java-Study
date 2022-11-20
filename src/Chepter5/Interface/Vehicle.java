package Chepter5.Interface;

public interface Vehicle {
    public abstract void speed();

    public default void start(){ // default 재정의를 꼭 하지 않아도 됨
        System.out.println("start");
    }
    public static void stop(){ // 재정의 하지 않아도 되며 다른 클래스에서 인터페이스 명으로 접근가능
        System.out.println("stop");
    }
}
