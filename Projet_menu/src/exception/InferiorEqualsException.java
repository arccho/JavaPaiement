package exception;

public class InferiorEqualsException extends Exception {
	
	public InferiorEqualsException(int n) {
		super(n  + " est inf�rieur ou �gal � 1");
	}
}
