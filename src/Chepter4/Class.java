package Chepter4;

// 클래스 관계

/*
*   1. has a 관계
*       -> 한 객체와 다른 객체가 포함관꼐인 경우를 의미한다.
*       ex) 자동차 객체 = 엔진객체, 바퀴객체, 핸들객체, 라디오객체
*       자동차는 전체(whole)이고 나머지는 부분이다(part) whole - part 라고도 한다,
*
*       2가지의 종류가 있다.
*           1. 집합관계(Aggregation Relationship)
*               -> whole과 part 간의 lifecycle이 다른 경우에 해당한다.
*               ex) 자동차 has a 라디오
*               = 자동차 객체가 라디오객체를 포함하고 있으나, 라디오 객체가 없어도 자동차 객체는 독자적으로 존재할 수 있다.
*
*            2. 구성 관계
*                whole과 part 간의 lifecycle이 같은 경우에 해당한다.
*                ex) 자동차 has a 엔진
*                엔진 객체가 없는 자동차 객체는 존재할 수 없다. 결국 두 객체의 lifecycle은 동일하다.
*
*   2. is a 관계
*       -> 비슷한 속성 및 동작을 가진 객체들 간의 관계이다.
*       ex) 대학생,고등학생,중학생,초등학생 객체들은 모두 공통된 개념의 학생 객체들이다.
*       대학생 is a 학생, 중학생 is a 학생
*
*       -> is a 관계의 객체들은 모두 공통된 속성 및 동작을 가지고 있으며,
*       하위 객체들에게 상위 개념의 객체를 상속받아서 사용한다면 중복이 제거되고 재사용성도 향상 될 수 있다.
*       is a 관계가 성립되는 객체들은 자바의 상속기법을 적용하여 객체지향 프로그래밍 개발시
*       다양한 장점들을 사용할 수 있도록 코드로 구성화한다.
*
* */
public class Class {
}
