package day1;

public class ConditionExam4 {
    public static void main(String[] args) {
        int tunnel1 = 180;
        int tunnel2 = 182;
        int tunnel3 = 172;

        int car = 170;

        if (tunnel1 > car && tunnel2 > car && tunnel3 > car) {
            System.out.println("PASS");
        }
        else {
            System.out.println("CRASH");
        }
    }
}
