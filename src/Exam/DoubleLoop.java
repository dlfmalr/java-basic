package Exam;

public class DoubleLoop {
    public static void main(String[] args) {
        //1번

        for(int dan = 2; dan < 10; dan++) {
            for(int j = 2; j < 10; j++) {
                if(j % 2 == 0) {
                    System.out.println(dan + " X " + j + " = " + dan*j);
                }
            }
        }

        //2번

        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for(int i = 4; i < 20; i++) {
            if(i % 2 == 1) {
                for(int j = 2; j <= 10; j+=2) {
                    System.out.println(i + " * " + j + " = " + i*j);
                }
            }
        }
    }
}
