package exception;

public class InferiorEqualsException extends Exception {
	
	public InferiorEqualsException(int n) {
		super(n  + " est inférieur ou égal à 1");
	}
}
