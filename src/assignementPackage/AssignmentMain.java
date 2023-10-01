package assignementPackage;

public class AssignmentMain {
	public static void main(String[] args) {
		
		//*****ASTERISK LOGGER EXAMPLE*************
		AsteriskLogger hello = new AsteriskLogger();
		hello.info("Hello");
		hello.error("Hello");
		
		
		//********SPACED LOGGGER EXAMPLE************
		SpacedLogger hello2 = new SpacedLogger();
		hello2.info("Hello");
		hello2.error("Hello");
	}

}
