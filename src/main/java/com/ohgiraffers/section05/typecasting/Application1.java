package com.ohgiraffers.section05.typecasting;

public class Application1 {

  public static void main(String[] args) {

    /* 수업 목표. 자동 형변환과 강제 형변황을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다. */

    /* 목차 1. 두 수의 연산 결과를 int 형으로 변환 후 int 자료형 변수에 리턴받는다. */
    int inum = 10;
    long lnum = 100;

    //int sum = (int) inum + lnum;
    //error: incompatible types: possible lossy conversion from long to int

    int sum = (int) (inum + lnum); //합산하려는 값을 ()로 감싸줘야 에러가 발생하지 않는다.

    /* 목차 2. long형 값을 int로 강제 형변환 한다. */
    int sum2 = inum + (int)lnum;

    /* 목차 3. 결과 값을 long형 자료형으로 받는다(자동형변환 이용) */
    long sum3 = inum + lnum;

    /* 주의사항. int 미만의 연산의 처리 결과는 int형이다. */
    byte byteNum1 = 1;
    byte byteNum2 = 2;
    short shortNum1 = 3;
    short shortNum2 = 4;

    int result1 = byteNum1 + byteNum2;
    System.out.println("result1 = " + result1); //result1 = 3

    int result2 = byteNum1 + shortNum1;
    System.out.println("result2 = " + result2); //result2 = 4

    int result3 = shortNum1 + byteNum1;
    System.out.println("result3 = " + result3); //result3 = 4

    int result4 = shortNum1 + shortNum2;
    System.out.println("result4 = " + result4); //result4 = 7
  }
}
