package com.ohgiraffers.section03.constant;

public class Application1 {

  public static void main(String[] args) {
    /* 수업 목표. 상수에 대해 이해하고 사용할 수 있다. */
    /* 필기.
     * 상수란?
     * 변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념이다.
     * 변하지 않는 값을(항상 고정된 값) 저장해두기 위한 메모리상의 공간을 상수라고 한다.
     *
     * 상수의 사용 목적?
     * 변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
     * 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.
     * 예) 수학 공식에 사용되는 수치 등
     *
     * 상수의 사용 방법
     * 1. 상수를 선언한다. (변수 선언과 유사하지만 final 키워드를 사용함)
     * 2. 값을 초기화 한다. (초기화 이후에는 값 변경 불가능함)
     * 3. 필요한 위치에 상수를 호출해서 사용한다.
     * */

    /* 목차 1. 상수 선언 */
    final int AGE; // 변수명을 대문자로 작성하고 자료형 앞에 'final'을 붙여준다.

    /* 목차 2. 초기화 */
    AGE = 20;
    //AGE = 30; // 한 번 초기화 한 이후 값을 재 대입하는 것은 불가능하다.
    // error: variable AGE might already have been assigned

    /* 목차 3. 필요한 위치에 상수를 호출해서 사용한다. */
    /* 3-1. 출력 구문에서 사용 */
    System.out.println("AGE의 값 : " + AGE);

    /* 3-2. 필요시 연산식에 호출해서 사용 */
    System.out.println("AGE의 2배 : " + (AGE * 2));

    /* 3-3. 대입연산식 활용 */
    int sum = AGE; // 대입 연산자의 오른 편에는 기술 가능함
    //int AGE = AGE + 10;
    //error: variable AGE is already defined in method main(String[])
  }
}
