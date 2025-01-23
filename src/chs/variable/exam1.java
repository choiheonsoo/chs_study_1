package chs.variable;

public class exam1 {
    public static void main(String[] args) {
        int year = 0;  // year라는 변수 이름에 정수 0 을 대입
        int age = 14;  // age라는 변수 이름에 정수 14 를 대입

        System.out.println(year);
        System.out.println(age);

        year = age + 2000; //변수 age의 값에 2000을 더해서 변수 year 저장
        age = age +1; //변수 age에 저장된 값을 1 증가 시킴.

        System.out.println(year);
        System.out.println(age);
    }
}
