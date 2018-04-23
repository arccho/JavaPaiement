package exception;

public class NotBetweenException extends Exception {
	public NotBetweenException(int n) {
		super("l'argument saisi n'est pas compris entre 1 et " + n);
	}
}
