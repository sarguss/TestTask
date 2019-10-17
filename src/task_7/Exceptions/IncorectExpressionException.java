package task_7.Exceptions;

public class IncorectExpressionException extends Exception{
    private String string;

    public IncorectExpressionException(String string){
        this.string = string;
    }

}
