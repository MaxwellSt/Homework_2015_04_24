package package_01;

public class IllegalArgument {

	public void testException(String s) throws IllegalArgumentException {
		
		if (s == null)
			throw new IllegalArgumentException("The parameter cannot be null!");
		
		System.out.println(s);
		
	}
}
