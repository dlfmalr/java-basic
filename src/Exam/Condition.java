package Exam;

public class Condition {
    public static void main(String[] args) {
        //1번
//        int num =10;
//
//        if(num % 2 == 0) {
//            System.out.println("even");
//        }
//        else {
//            System.out.println("odd");
//        }

        //2번

//        int num1 = 10;
//        int num2 = 20;
//        int result = 0;
//
//        if(num1 <= num2) {
//            result = num2 - num1;
//        }
//        else {
//            result = num1 - num2;
//        }
//
//        System.out.println(result);
        //3번

        // 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다..
// 조건 : 2가지 이상의 방법으로 풀어야 합니다.

        int age = 21; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 구현시작
        if (age <= 19) {
            System.out.println("할인대상입니다.");
        } else if (age >= 60) {
            System.out.println("할인대상입니다.");
        } else {
            System.out.println("할인대상이 아닙니다");
        }
        // 구현 끝

        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.

        //4번

        /*
어떤 차의 높이가 170cm 입니다..

이 차는 3개의 터널을 차례대로 지나게 될 것입니다.

터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 납니다.

차가 모든 터널을 무사히 잘 통과하면 PASS 를 출력하고, 충돌한다면 CRASH 를 출력하세요.
*/
        int tunnel1 = 180;
        int tunnel2 = 182;
        int tunnel3 = 172;

        int car = 170;
        if(tunnel1 <= car || tunnel2 <= car || tunnel3 <= car) {
            System.out.println("crash");
        }
        else {
            System.out.println("pass");
        }



    }
}
