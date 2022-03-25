package fileobjexample;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceStreams {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\Dell\\Desktop\\MyFile.txt");
		File f2 = new File("C:\\Users\\Dell\\Desktop\\DataFile.txt");
		String data = "This is data from byte";
		byte[] bytes = data.getBytes();

		FileInputStream fin1 = new FileInputStream(f1);
		FileInputStream fin2 = new FileInputStream(f2);
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);

		Vector<InputStream> v = new Vector<>();
		v.add(fin1);
		v.add(fin2);
		v.add(bis);
		// SequenceInputStream sis = new SequenceInputStream(new
		// SequenceInputStream(fin1, fin2), bis);
		SequenceInputStream sis = new SequenceInputStream(v.elements());
		int j = 0;
		while ((j = sis.read()) != -1) {
			System.out.println("Bytes Read" + " " + (char) j);
		}
	}

}
