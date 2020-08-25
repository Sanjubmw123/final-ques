package Property;

import java.io.IOException;

public class propertyMain {

	public static void main(String[] args)throws IOException {
		System.out.println("apple ="+PropertyNotMain.doesfileexist("Apple"));
		System.out.println("Table ="+PropertyNotMain.doesfileexist("Table"));
		System.out.println("Orange =" +PropertyNotMain.doesfileexist("Orange"));
	}

}
