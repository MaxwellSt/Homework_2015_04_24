package package_01;

public class Arithmetic {

	public void testException() throws ArithmeticException {

		int a;
		
		try {
			
			a = 1/0;
			
		} catch (ArithmeticException e) {
			
			throw e;

		}

	}
}
