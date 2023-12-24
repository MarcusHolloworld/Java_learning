package assignment.internshala.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    String data = "I love my India.";

        // Create file and write to the file..
	    try {
		    FileOutputStream fos = new FileOutputStream("myFile.txt");
		    byte[] byteData = data.getBytes();
		    fos.write(byteData);
		    fos.close();
	    } catch (IOException ex) {
		    System.out.println(ex);
	    }

	    // Read from the file..

	    try {
		    FileInputStream fis = new FileInputStream("myFile.txt");
		    int i = 0;
		    while ((i = fis.read()) != -1) {
			    System.out.print((char) i);
		    }
		    fis.close();
	    } catch (IOException x) {
		    System.out.println(x);
	    }

    }
}
