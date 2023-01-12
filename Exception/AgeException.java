package Exception;

public class AgeException extends Exception{

    public AgeException(String s){

        super(s);
    }
    public AgeException(Throwable cause){
        super(cause);
    }

    public AgeException(String s,Throwable cause){

        super(s,cause);
    }
}
