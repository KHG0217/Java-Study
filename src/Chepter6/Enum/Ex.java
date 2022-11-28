package Chepter6.Enum;

public class Ex {
    // 열거형 상수 생성
    public enum Colors {RED,BLACK,YELLOW,BLUE};

    public static void main(String[] args) {
        Colors color = Colors.BLACK;
        System.out.println(color);

        // 열거형 메소드
        Colors[] c = Colors.values();
        for(Colors x : c){
            System.out.println(x.name() + "\t" + x.ordinal());
        }

        // switch
        switch (color){
            case RED:
                System.out.println("Red");
                break;
            case BLACK:
                System.out.println("Black");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            case YELLOW:
                System.out.println("Yellow");
                break;
            default:
                break;
        }
    }
}
