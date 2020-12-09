package exception;

public class EmptyInputException extends Exception {
    public EmptyInputException(String errorMessage){
        super(errorMessage);
    }
}
