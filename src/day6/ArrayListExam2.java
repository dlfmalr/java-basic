package day6;

import java.util.ArrayList;

public class ArrayListExam2 {
    public static void main(String[] args) {

        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        ArrayList<사람> 사람들 = new ArrayList<>();

        사람들.add(사람1);
        사람들.add(사람2);
        사람들.add(사람3);
        사람들.add(사람4);



        // 2. 네 사람에게 자기소개 시키기
        for(int i = 0; i < 사람들.size(); i++) {
            //사람 타겟 = 사람들.get(i);
            //타겟.introduce();

            사람들.get(i).introduce();
        }
        // 3. 30대인 사람에게만 자기소개 시키기
        //향상된 반복분
        for(사람 대상 : 사람들) {
            if(대상.getAge() >= 30 && 대상.getAge() < 40) {
                대상.introduce();

            }
        }

    }
}
class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}