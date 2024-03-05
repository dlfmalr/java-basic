package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(j);
            }
        }

        //구구단 2단 출력

        System.out.println("2 X 1 = 2");
        System.out.println("2 X 2 = 4");
        System.out.println("2 X 3 = 6");
        System.out.println("2 X 4 = 8");

        //2단
        int dan = 2;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }

        //3단
        dan = 3;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }
        //4단
        dan = 4;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
        //2단 8번
        int dan2 = 2;
        for (int j = 0; j < 8; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
            dan2++;
        }

        //for (int dan2 = 0; dan2 < 8; dan2++) {
            //for (int i = 1; i <= 9; i++) {
                 //System.out.println(dan2 + " x " + i + " = " + (dan2 * i));
           // }
        }
    }