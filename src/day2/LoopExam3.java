package day2;

public class LoopExam3 {
    public static void main(String[] args) {
        int time = 74;
        int score = 0;

        for(int i = 0; i < 90 - 74; i++) {
            if(i % 5 == 0) {
                score++;
            }
        }
        System.out.println(score);

        // 출력 : 4
    }
}
