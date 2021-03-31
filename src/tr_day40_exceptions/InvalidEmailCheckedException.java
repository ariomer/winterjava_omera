package tr_day40_exceptions;

public class InvalidEmailCheckedException extends Exception {
    
    private static final long serialVersionUID = 1L; 
    // Java exception'larin tekrarsiz olmasini saglamak icin her exception'a unique bir kod verir
    InvalidEmailCheckedException(String message){
        super(message);
    }

}
