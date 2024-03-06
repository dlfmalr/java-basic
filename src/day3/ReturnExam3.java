package day3;

public class ReturnExam3 {

    public static boolean isNegative(int num) {
        return num < 0;
    }

    public static void main(String[] args) {
        int no = -1;

        if (isNegative(no)) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("양수입니다.");
        }
        // no 값을 바꿔가면서 테스트해보세요.
    }
}
