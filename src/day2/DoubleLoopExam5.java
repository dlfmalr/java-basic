package day2;

public class DoubleLoopExam5 {
    public static void main(String[] args) {
        int rows = 3;
        for(int i = 0; i < rows; i++) { //줄의 갯수
            for (int j = 0; j < rows - i -1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++) { //별의 갯수
                System.out.print("*");
            }
            System.out.print("\n");
        }
        rows = 5;
        for(int i = 0; i < rows; i++) { //줄의 갯수
            for (int j = 0; j < rows - i -1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++) { //별의 갯수
                System.out.print("*");
            }
            System.out.print("\n");
        }
        rows = 7;
        for(int i = 0; i < rows; i++) { //줄의 갯수
            for (int j = 0; j < rows - i -1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++) { //별의 갯수
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}
