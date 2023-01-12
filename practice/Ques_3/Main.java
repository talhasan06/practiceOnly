package practice.Ques_3;

public class Main {
    public static void main(String[] args) throws InvalidTxnException {
//        CreditCard c1=new CreditCard(-5000);
        CreditCard c2=new CreditCard(10000);
        c2.withdraw(7000);
        c2.withdraw(4000);
    }
}
