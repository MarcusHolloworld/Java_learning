package assignment.internshala.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Text {
	public static void main(String[] args) {

		String text = "Mey tera gand Far dunga. Nikal ja bahanka lora";

		try {
			FileOutputStream fos = new FileOutputStream("myFile2.txt");
			byte[] byteData = text.getBytes();
			fos.write(byteData);
			fos.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}

		try {
			FileInputStream fis = new FileInputStream("myFile2.txt");
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
}
