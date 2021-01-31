
public class InvalidAgeException extends Exception{
	String n="";
	
public InvalidAgeException(String n) {
	super("You are not suitable for application ");
	
}
public InvalidAgeException() {
	super("You are not suitable for application ");
}
}
