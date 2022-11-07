package Chepter3;

public class StaticBlock {
    /*
    *  Static 블록, 초기화 블록
    *       1. 인스턴스 초기화 블록
    *            1. 인스턴스 변수의 초기화에 사용할 수 있다.
    *            2. 객체생성 할 때마다 수행된다
    *            3. 일반적으로 생성자를 사용하기 때문에 잘 사용되지 않는다.
    *            4. 생성자보다 인스턴스 초기화 블록이 먼저 수행됨
    *
    *           public class Test{
    *
    *               {
    *                   인스턴스 초기화 블럭
    *               }
    *           }
    *
    *       2. static 초기화 블록
    *           1. static 변수의 초기화 및 프로그램 시작시 초기화 작업이 필요한 경우에 사용됨
    *           2. 프로그램 시작시 단 한번 수행된다.
    *           3. static 변수들이 생성된 후에 바로 static 초기화 블럭이 static 변수들을 초기화한다.
    *
    *       public class Test {
    *
    *           static {
    *               // static 초기화 블록
    *           }
    *
    *       }
    */

        public StaticBlock(){
            System.out.println("StaticBlock 생성자");
        }

        // static 블록
        static {
            System.out.println("static 블록 프로그램 실행시 실행");
        }

    {
        System.out.println("instance 블록은 객체생성시 실행");
    }

    public static void main(String[] args) {
        System.out.println("main 메소드 실행");
        StaticBlock ex = new StaticBlock();
        StaticBlock ex2 = new StaticBlock();
    }
}
