package day6;
// 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
// 조건 : 성과 이름은 띄어쓰기로 구분해주세요.
import java.util.Scanner;
public class StringInputExam1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("이름을 입력해주세요 : %s\n", name);
        int age = scan.nextInt();
        System.out.printf("나이를 입력해주세요 : %d\n", age);


        // v1
        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        String name2 = scan.nextLine();
        System.out.printf("이름을 입력해주세요 : %s\n", name2);
        int age2 = scan.nextInt();
        System.out.printf("나이를 입력해주세요 : %d\n", age2);

        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        //버퍼 찌꺼기 때문에 입력 꼬이는 것 해결하는 방법
        //1. 버퍼를 직접 비워준다.
        //2. 입력을 nextLine으로 통일한다.
    }
}
