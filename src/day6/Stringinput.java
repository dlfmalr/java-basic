package day6;

import java.util.Scanner;

public class Stringinput {

    //문자열 입력
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //문자열 입력1 -> 단어 입력
        //문자열 입력2 -> 문장 입력

        //String str = scan.next();
        //System.out.println(str);

        String str2 = scan.nextLine(); // 문장입력. 엔터를 입력할 때까지 입력을 받음
        System.out.println(str2);
    }

}
