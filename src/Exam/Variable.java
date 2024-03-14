package Exam;

public class Variable {
    public static void main(String[] args) {

        int i = 100;
        double d = 3.14;
        String s = "안녕하세요";
        System.out.println(i); // 출력 : 100
        System.out.println(d); // 출력 : 3.14
        System.out.println(s); // 출력 : 안녕하세요

        i = 200;
        d = 10.5;
        s = "반갑습니다.";
        System.out.println(i); //출력 : 200
        System.out.println(d); //출력 : 10.5
        System.out.println(s); //출력 : 반갑습니다.

        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("a : " + a);
        System.out.println("b : " + b);


    }


}
