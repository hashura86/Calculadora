package MyException;

public class DividirPorZeroException extends ArithmeticException {
    private String msg;
    public DividirPorZeroException(String msg){
      super(msg);
      this.msg = msg;
    } 

    @Override
    public String getMessage() {
        return msg;
    }

    
    
}
