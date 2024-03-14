package Exam;

public class Loop {
    public static void main(String[] args) {
        //1번

//        for(int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
        int cnt = 1;
        while(cnt <= 100) {
            System.out.println(cnt);
            cnt++;
        }

        //2번(1)
        cnt = 2;
        while(cnt <= 100) {
            System.out.println(cnt);
            cnt += 2;
        }
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        //2번(2)
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i + ":even");
            }
            else {
                System.out.println(i + ":odd");
            }
        }

        //3번
        /*
축구 경기가 진행중입니다. 축구경기 타임은 총 90분이고,

현재 A팀이 0점, B팀이 2점인 상황에서, A팀은 최고의 스트라이커인 손흥민을 투입하기로 결정했다.

손흥민은 투입과 동시에 그리고 5분마다 골을 넣을 수 있는 능력을 가지고 있다.

만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.

(90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 해당 경기의 심판은 추가시간을 주지 않는 것으로 유명하다.)

현재 경기타임 time과 A팀의 득점 score가 주어질 때, 손흥민을 투입하면 A팀의 최종 득점은 몇 점인지 출력하시오.
*/

        int time = 74;
        int score = 0;

        for(int i = 0; i < 90 - time; i+=5) {
            if(i % 5 == 0) {
                score++;
            }
            System.out.println(score);
        }

        //4번, 오름차순으로 나타내기

        int a = 12;
        int b = 5;

        for(int i = b; i <= a; i++) {
            System.out.println(i);
        }
        for(int i = a; i <= b; i++) {
            System.out.println(i);
        }


    }

}
