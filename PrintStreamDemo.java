package fileobjexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fin = new FileOutputStream("C:\\Users\\Dell\\Desktop\\MyFile.txt");
		PrintStream printstream = new PrintStream(fin,true);
		printstream.print("Data FROM JAVA APP");
		printstream.print((int) 123);
		printstream.print((float)1.2);
		printstream.close();
	}

}
