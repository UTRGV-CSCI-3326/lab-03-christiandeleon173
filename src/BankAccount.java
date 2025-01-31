
public class BankAccount {
    public static void main(String[] args){
        float bobMoney = 2175.37f;

        bobMoney -= 302.50;
        bobMoney += 50.03;
        bobMoney  = (bobMoney/2.f) + 20.f;
        bobMoney -= 1.f;
        bobMoney *= 2.f;
        bobMoney += 1.f;

        bobMoney = Math.round(bobMoney * 100.f) / 100.f;

        System.out.printf("%.2f\n", bobMoney);
    }
}
