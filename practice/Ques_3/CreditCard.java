package practice.Ques_3;

public class CreditCard {
    private double credit_limit;
    private double credit_current;
    public CreditCard(double limit)throws InvalidTxnException{
        if(limit<=0){
            throw new InvalidTxnException(limit+" is not a valid amount for the requested transaction");
        }else {
            credit_limit = limit;
            credit_current = 0;
        }
    }
    public void withdraw(double amount)throws InvalidTxnException{
        if(amount>credit_limit){
            throw new InvalidTxnException(amount+" cannot be withdrawn with current credit of "+credit_limit);
        }else{
            credit_current+=amount;
            credit_limit-=credit_current;
        }

    }
}
