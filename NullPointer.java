package package_01;

public class NullPointer {

	public void testException() throws NullPointerException {
		Integer a = null;
		
		try {
			a = 2 * a;
		} catch (NullPointerException e) {
			throw e;
		}
	}
}
