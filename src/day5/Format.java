package day5;

public class Format {
    public static void main(String[] args) {
        int age = 20;
        String name = "홍길동";
        System.out.println("안녕하세요. "+ age + "살입니다.");

        //%d : 정수
        //%s : 문자열
        //%f : 실수
        System.out.printf("안녕하세요 %d살 %s입니다.몸무게는 %f kg 입니다.\n", age, name, 50.5);
    }
}
