package assignementPackage;

public class AsteriskLogger implements Logger{

	@Override
	public void info(String log) {
		System.out.println("***"+ log +"***\n");
	}

	@Override
	public void error(String error) {
		System.out.println("******************************");
		System.out.println("***ERROR:"+ error +"***");
		System.out.println("******************************");
		
	}

}
