package day3;

public class ReturnExam4 {
    public static void main(String[] args) {
        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5);  // 출력: 2 4
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void printEven(int n) {
        for (int i = 2; i <= n; i += 2) {
            if (isEven(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
