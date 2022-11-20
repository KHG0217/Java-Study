package Chepter5.Interface;

public class Ex {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.takeoff();
        bird.fly();
        bird.land();

        Flyer flyer = new Airplane();
        flyer.takeoff();
        flyer.fly();
        flyer.land();
    }
}
