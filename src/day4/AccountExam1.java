package day4;

public class AccountExam1 {

    public static void main(String[] args) {

        Account a1 = new Account(); //철수계좌

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int money = a1.withdraw(400);
        System.out.println(money); // 400

        int remainder = a1.getRemainder();
        System.out.println(remainder); // 5600

        money = a1.withdraw(1400);
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200

        Account a2 = new Account(); //영희 계좌
        a2.deposit(1000);

        remainder = a1.remainder;
        System.out.println(remainder);

        int reminder2 = a2.getRemainder();
        reminder2 = a2.remainder2;
        System.out.println(remainder);

    }
}
