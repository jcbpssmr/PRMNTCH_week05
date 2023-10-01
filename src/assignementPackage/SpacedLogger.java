package assignementPackage;

public class SpacedLogger implements Logger {

	@Override
	public void info(String log) {
		for (int i = 0; i<log.length(); i++) {
			 char letter = log.charAt(i);
			 System.out.print(letter+ " ");
		}
		System.out.println("\n");
		
	}

	@Override
	public void error(String error) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i<error.length(); i++) {
			 char letter = error.charAt(i);
			 result.append(letter+ " ");
		}
		System.out.println("Error: " + result.toString());
			 
		
	}

}
