package com.ohgiraffers.section04.overflow;

public class Application1 {

  public static void main(String[] args) {

    /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
    /* 필기.
     *   자료형 별 값의 최대 범위를 벗어나는 경우
     * */

    /* 목차 1. 오버플로우 */
    byte num1 = 127;

    System.out.println("num1 : " + num1); // -127 : byte의 최대 저장 범위

    num1++; // 1 증가

    System.out.println("num1 : " + num1); // -128 : byte의 최소 저장 범위
    // 출력값 =  num1 : -128
    // byte 자료형에서 저장할 수 있는 최대 저장 범위인 127에서 1이 증가해 128이 되면
    // byte에서 저장할 수 있는 범위를 초과했기 때문에 -128이라는 byte의 최소 저장 범위로 초기화

    /* 목차 2. 언더플로우 */
    byte num2 = -128;

    System.out.println("num2 : " + num2);

    num2--;

    System.out.println("num2 : " + num2);
    // 출력값 =  num2 : 127
    // byte 자료형에서 저장할 수 있는 최소 저장 범위인 128에서 1가 감소해 -129이 되면
    // byte에서 저장할 수 있는 범위를 초과했기 때문에 -128이라는 byte의 최소 저장 범위로 초기화

    //int형의 최대값은 대략 21억 정도이다.
    // 이 범위를 벗어난 계산은 오버플로우를 발생시켜 원하지 않는 결과값이 나오게 될 수 있다.
    int firstNum = 1000000;
    int secondNum = 700000;

    int multi = firstNum * secondNum; // 1000000

    System.out.println("multi = "+multi); // multi = -79669248 으로 출력된다.

    // 해결방법
    long longMulti = firstNum * secondNum;
    System.out.println("multi = " + longMulti); // multi = -79669248 으로 출력된다.
    // -> 변수 firstNum 과 secondNum의 자료형이 int이기 때문에 multi의 자료형을 long으로 선언해도 변수값의 자료형은 int이다.

    long result = (long) firstNum * secondNum; // 강제형변화 : int 자료형이었던 값을 long 자료형으로 강제 변환해준다.
    System.out.println("result = " + result); // result = 700000000000 으로 출력된다.
  }
}
