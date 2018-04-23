package exception;

public class NoNumberException extends Exception {

	public NoNumberException() {
		super("l'argument saisi n'est pas un nombre");
	}
}
