package day3;

public class ParmeterExam3 {
    public static void introduce(int a) {
        for(int i = 1; i <= a; i++) {
            System.out.println("안녕하세요. 20살 홍길동입니다.!");
        }
    }

    public static void main(String[] args) {
        introduce(3);
        System.out.println();
        introduce(5);
        System.out.println();
        introduce(10);
    }


}
