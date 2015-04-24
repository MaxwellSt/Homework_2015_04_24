package package_01;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestMain {

	public static void main(String[] args) {

		//FileNotFoundException
		FileNotFound fileNotFound = new FileNotFound();

		try {
			fileNotFound.testException();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Arithmetic
		Arithmetic fileIO = new Arithmetic();
		try {
			fileIO.testException();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		//ArrayIndexOutOfBoundsException
		ArrayIndex arrayIndex = new ArrayIndex();
		try {
			arrayIndex.testException();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//ArrayStoreException
		ArrayStore arrayStore = new ArrayStore();
		try {
			arrayStore.testException();
		} catch (ArrayStoreException e) {
			e.printStackTrace();
		}
		
		//NegativeArraySizeException
		NegativeArraySize negativeArraySize = new NegativeArraySize();
		try {
			negativeArraySize.testException();
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}
		
		//NullPointerException
		NullPointer nullPointer = new NullPointer();
		try {
			nullPointer.testException();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		//IllegalArgumentException
		IllegalArgument illegalArgument = new IllegalArgument();
		try {
			illegalArgument.testException(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
