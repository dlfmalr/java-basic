package day3;

public class Scope {
    public static void main(String[] args) {
        //원론적으로는 함수 하나에서 모든걸 만들 수 있음
        //코드를 함수로 쪼개서 관리

        //함수는 같은 클래스 내에 있는 함수끼리만 호출 밑 사용 가능

        //요청을 해야 함.
        // . 은 앞에거가 뒤에거의 소유자
        double result = Calculator.plus(5, 3);
        System.out.println(result);

        //Scope
        //변수의 유효범위

        //지역에서 만들어져서 지역에서만 사용되는 변수 -> 지역변수
        //함수 내의 변수는 모두 지역변수

        int a = 10; //a 변수의 유효범위는 main 함수 내부

        {
            int b = 20; //b 변수의 유효범위는 블록 내부
        }
        //System.out.println(b);

        if(true) {
            int c = 50;
        }
        //System.out.println(c);


        {
            int d;
        }
        {
            //System.out.println(d);
        }
        //같은 함수 내에서는 동일한 이름으로 변수가 2개 이상 동시에 존재할 수 없다

        //인스턴스(객체) 변수
        //클래스 내에서 만들어져서 클래스 내에서 사용되는 변수


    }
}
//함수가 많아지면 묶어서 관리 -> 배열, 클래스
//함수가 많아지면 묶어서 관리 -> 클래스