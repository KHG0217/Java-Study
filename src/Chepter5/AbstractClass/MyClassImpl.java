package Chepter5.AbstractClass;

public class MyClassImpl extends MyClass{

    public void print(){
        System.out.println(num); // 상속 받았기 때문에 MyClass 변수 사용 가능
    }
    @Override // 강제성이 생김
    public void methodB() {
        System.out.println("methodB");
    }
}
