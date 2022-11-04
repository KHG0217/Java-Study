package Chepter2;

public class ConditionalStatement {
    public enum  Color { RED , BLUE , GREEN }
    public static void main(String[] args) {
        // if문은 생략

        // switch 문 - if-else문과 비슷하나 반드시 일치하는 값 비교로만 사용 가능!
        //             일치하는 case문장이 실행된다.

        int score =88;
        char grade;

        switch ( score / 10){
            case 10 : grade ='A'; break;
            case 9 : grade ='B'; break;
            case 8 : grade ='C'; break;
            case 7 : grade ='D'; break;
            default : grade ='F'; break;
        } // end switch

        System.out.println("학점은 " + grade);

        // enum을 이용한 switch문

        Color c =Color.GREEN;

        switch ( c) {
            case RED:
                System.out.printf("빨강"); break;
            case BLUE:
                System.out.printf("파랑"); break;
            case GREEN:
                System.out.printf("초록"); break;
            default:
                System.out.printf("없음"); break;
        } // end Switch

    }
}
