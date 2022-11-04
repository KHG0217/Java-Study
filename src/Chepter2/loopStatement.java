package Chepter2;

public class loopStatement {

    public static void main(String[] args) {
        // 기본 for문은 생략

        // while문

        /*
        *   while(조건식) {
        *       문장1;
        *       증감식;
        *   }
        * */

        int n = 1;
        while(n <=10){
            System.out.println(n + " Hello World");
            n++;
        }
        System.out.println("while문 종료");

        // do-while문 - while문과 비슷하나  while문은 조건 먼저 검사 -> 실행 / do-while문은 문장실행 -> 조건검사

        /*
        *   do{
        *       문장1
        *   } while(조건식1);
        * */

        int e = 1;
        do{
            System.out.println(n + "Hello World");
            e++;

        }while(e <=10 );
        System.out.println("do~while문 해제");

        // break - 문을 만나면 while블럭 나옴

        // continue - 다음 문장을 수행하지않고 다시 반복문의 처음으로 돌아감
    }
}
