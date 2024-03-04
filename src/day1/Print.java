package day1;

public class Print {
    public static void main(String[] args){
        System.out.println("차태진");
        System.out.println("홍길동");

        System.out.println("손혜승");
        System.out.println("최범규");


        // \n 은 줄바꿈
        System.out.println("안녕하세요\n반갑습니다.");

        // 문자열 합치기(+)
        System.out.println("안녕하세요 손혜승입니다");
        System.out.println("안녕하세요" + "손혜승입니다" + "반갑습니다");

        //숫자 더하기
        System.out.println(100 +200);
        System.out.println(2000 + 3000);


        System.out.println("100");//문자
        System.out.println(100);//숫자

        //숫자와 문자는 정확히 구별해서 사용
        System.out.println("100");
        System.out.println(100 + 200);

        //문자 + 숫자 => 숫자를 문자화해서 붙임
        System.out.println("100" + 200);

        //출력문을 이용해 더하기 식 표현하기
        //+연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        System.out.println("100 + 200 = " + (100 + 200));

        // 숫자 곱하기 (*)
        System.out.println(100 * 200);

        //구구단 2단
        System.out.println("2 X 1 =" + (2 * 1) +
                "\n2 X 2=" + (2 *2));

        }



        }





