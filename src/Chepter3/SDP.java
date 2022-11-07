package Chepter3;

public class SDP {
    // SDP - Singleton Design Pattern
    // 자바의 디자인 패턴중 일반적으로 가장 많이 알려진 패턴, 하나의 인스턴스만을 생성하기 위한 패턴이다.
    // 가상세계에서 단 하나의 인스턴스만 생성하고자 할 때 사용되는 방법

    String name;
    private static SDP a = new SDP("XX은행");
    private SDP(String name){
        this.name=name;
    }

    public static SDP getSDP(){
        return a;
    }

    public String getName(){
        return name;
    }


}
