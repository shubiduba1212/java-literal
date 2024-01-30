package com.ohgiraffers.section05.typecasting;

public class Application2 {

  public static void main(String[] args) {

    /* 수업 목표. 자동 형변환 규칙에 대해 이해할 수 있다. */
    /* 필기.
     *  데이터 형변환
     *  데이터 형변환이 필요한 이유
     *  - 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
     *  - 즉,같은 데이터 타입끼리만 연산을 수행할 수 있다.
     * */

    /* 필기.
     *  형변환의 종류와 규칙
     *  1. 자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
     *   1-1. 작은 자료형에서 큰 자료형은 자동 형변환 된다.
     *   1-2. 정수는 실수로 자동 형변환된다.
     *   1-3. 문자형은 int형으로 자동 형변환된다.
     *   1-4. 논리형은 형변환 규칙에서 제외된다.
     *  2. 강제형변환(명시적 형변환) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 형변환
     *   2-1. 자동형변환이 적용되지 않은 경우 강제 형변환이 필요하다.
     **/

    /* 목차 1. 자동형변환 규칙 테스트 */
    /* 목차 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다. */
    /* 필기. 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우
            데이터 손실이 발생하지 않기 때문에 컴파일러가 자동으로 처리해준다. */

    /* 목차 1-1-1. 정수끼리의 자동 형변환 */
    byte bnum = 1;
    short snum = bnum;
    int inum = snum;
    long lnum = inum;

    int num1 = 10;
    long num2 = 20;

    //int result = num1 + num2; // 자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
    //int 자료형보다 long 자료형이 더 크기때문에 int 자료형 변수 result에 더한값을 대입할 수 없다.

    long result = num1 + num2;

    //단축키
    //soutv : 자동으로 바로 위 변수의 값을 출력할때
    System.out.println("result = " + result); // result = 30

    /* 목차 1-1-2. 실수 끼리의 자동 형변환 */
    float fnum = 4.0f;
    double dnum = fnum;

    double result2 = fnum + dnum;

    System.out.println("result2 = " + result2); // result2 = 8.0


    /* 목차 1-1-3. 정수는 실수로 자동 형변환 된다. */
    long lnum2 = 8;
    float fnum2 = lnum2;

    /* 목차 1-3. 문자형은 int형으로 자동 형변환 된다. */
    char ch1 = 'a';
    int charNumber = ch1; // 유니코드 참고

    System.out.println("charNumber = " + charNumber); // charNumber = 97

    /* 목차 1-4. 논리형은 형변환 규칙에서 제외된다. */
    boolean isTrue = true;
    // byte b = isTrue;  // error: incompatible types: boolean cannot be converted to byte
    // short s = isTrue;
    // int i = isTrue;
    // long l = isTrue;
    // char c = isTrue;
    // float f = isTrue;
    // double d = isTrue;

  }
}
