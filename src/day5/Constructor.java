package day5;

public class Constructor {
    public static void main(String[] args) {
        //사람 a사람 = new 사람(20, "홍길동", "서울");
        //객체의 데이터 세팅 -> 객체 초기화
        //a사람.나이 = 20;
        //a사람.이름 = "홍길동";
        //a사람.거주지 = "서울";
        //a사람.초기화(20, "홍길동", "서울");
        //객체 초기화는 꼭 필요한데 실수로 누락할 수 있다.

        //a사람.자기소개(); //객체가 올바르게 작동하는데 데이터가 반드시 필요하다.

        //사람 a사람2 = new 사람();//(20, 홍길동, 서울);
        //a사람2.나이 = 30;
        //a사람2.이름 = "홍길순";
        //a사람2.거주지 = "부산";
        //a사람2.초기화(30, "홍길순", "부산");

        //a사람2.자기소개();

         //new 사람(20, "손혜승", "세종");
        //사람 b사람 = new 사람(); //생성자 호출
        //사람 c사람 = new 사람();

    }
}

class 사람{
    int 나이;
    String 이름;
    String 거주지;

    //생성자 -> 객체가 생성될 때 자동으로 호출되는 메서드
    //작성규칙 ->리턴타입 X, 이름은 무조건 클래스이름과 동일하게

   // public 사람(int 나이, String 이름, String 거주지) { //생성자
   //     System.out.println("사람이 한명 만들어집니다.");
   //     this.나이 = 나이;
   //     this.이름 = 이름;
   //     this.거주지 = 거주지;
   //     System.out.println("안녕하세요. 저는 " + 거주지 + "사는 " + 나이 + "살 " + 이름 + "입니다.");
    //}

    //함수의 지역변수와 객체의 인스턴스 변수는 동일한 이름으로 존재 가능
    public void 초기화(int 나이, String 이름, String 거주지) {
        //this는 객체를 가리킨다.
        this.나이 = 나이;
        this.이름 = 이름;
        this.거주지 = 거주지;
    }

//    public 사람(){} //기본 생성자. 안 만들면 자바가 자동으로 만들어줌
//다만 내가 생성자를 의도적으로 만들면 자바는 기본생성자를 자동 생성하지 않는다.

    public void 자기소개() {
       System.out.println("안녕하세요. 저는 " + 거주지 + "사는 " + 나이 + "살 " + 이름 + "입니다.");
    }
    //public 사람(int 나이) {}
   // public 사람() {
        //super("홍길동", 27);

    //}
}