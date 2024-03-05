package day2;

public class DoubleLoopExam3 {
    public static void main(String[] args) {
        int rows = 3;
        for(int i = 1; i <= rows; i++) { //줄의 갯수
            for(int j = 1; j <= i; j++) { //별의 갯수
                System.out.print("*");
            }
            System.out.print("\n");
        }
        rows = 5;
        for(int i = 1; i <= rows; i++) { //줄의 갯수
            for(int j = 1; j <= i; j++) { //별의 갯수
                System.out.print("*");
            }
            System.out.print("\n");
        }
        rows = 7;
        for(int i = 1; i <= rows; i++) { //줄의 갯수
            for(int j = 1; j <= i; j++) { //별의 갯수
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
