package day5;

public class Overloading {
    public static void main(String[] args) {
        //계산기 a계산기 = a계산기.더하기(1, 2);
    }
}

//함수(메서드)의 이름이 같아도 매개변수의 타입이 다르거나 개수가 다르면 다른 함수로 인식한다. -> 오버로딩
class 계산기 {

    int 더하기(int num1, int num2) {
        return num1 + num2;
    }
    double 더하기2(double num1, double num2) {
        return num1 + num2;
    }
    int 더하기2(int num1, int num2) {
        return num1 + num2;
    }
}