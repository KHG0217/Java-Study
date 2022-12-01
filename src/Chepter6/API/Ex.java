package Chepter6.API;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex {
    public static void main(String[] args) {
        /* Scanner API */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("이름을 입력하세요.");
//        String name = scan.nextLine();
//
//        System.out.println("나이를 입력하세요.");
//        int age = scan.nextInt();
//
//        System.out.println("체중을 입력하세요");
//        Double weight = scan.nextDouble();
//
//        System.out.println("결혼여부를 입력하세요.");
//        boolean isMarried = scan.nextBoolean();
//
//        System.out.println("이름" + name);
//        System.out.println("나이" + age);
//        System.out.println("체중" + weight);
//        System.out.println("결혼" + isMarried);
//        scan.close();

        /* StringTokenizer API*/
        String mssg = "홍길동,이순신,유관순";

        StringTokenizer st = new StringTokenizer(mssg,",");

        while (st.hasMoreElements()){
            String token = st.nextToken();
            System.out.println(token);
        }

        /* Arrays API */

        // 1. 배열복사
        String[] str = {"홍길동","이순신","유관순"};
        String[] str2 = Arrays.copyOf(str,str.length);
        for(String name : str2){
            System.out.println("이름 :" + name);
        }

        // 2. 특정값으로 전체 채우기
        int [] nums = {10,20,30};
        Arrays.fill(nums,100);

        for(int num : nums){
            System.out.println("fill 값: " + num);
        }

        // 3. 특정값 일부만 채우기
        String[] fruits = {"사과","배","수박","바나나"};
        Arrays.fill(fruits, 0, 2,"딸기");
        for(String fruit : fruits){
            System.out.println("fruit: " + fruit);
        }

        // 4. 배열 비교
        String [] p = {"홍길동","이순신","유관순"};
        String [] p2 = {"홍길동","이순신","유관순"};
        String [] p3 = Arrays.copyOf(p,p.length);
        System.out.println(Arrays.equals(p,p2));
        System.out.println(Arrays.equals(p2,p3));

        // 5. 정수형 정렬
        int [] num = {22, 1, 3, 4, 52, 4,11};
        Arrays.sort(num);
        for(int i : num){
            System.out.println(i);
        }

        // 6. 문자열 정렬
        String[] name ={"ckhg","akhg","zkhg","bkhg"};

        Arrays.sort(name);
        for(String a : name){
            System.out.println(a);
        }

        // 7. 인덱스 찾기
        String[] s ={"홍길동","이순신","유관순"};
        int index = Arrays.binarySearch(s,"이순신");
        System.out.println( index);

    }
}
