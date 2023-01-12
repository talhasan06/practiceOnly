package Exception;

public class CustomMain {
    public static void main(String[] args) throws AgeException {

        validAge(-1);
    }
    private static void validAge(int age)throws AgeException{
        if(age<0){
//            throw new AgeException("age not valid");
//            throw new AgeException(new RuntimeException());
//            ,new RuntimeException()
            throw new AgeException("age not valid");
        }
    }
}
