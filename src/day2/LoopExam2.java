package day2;

public class LoopExam2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i); //짝수일 때만 실행
            }
        }
    }
}
