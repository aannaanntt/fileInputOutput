package fileobjexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISandFOS {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Dell\\Desktop\\MyFile.txt");
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fi = new FileOutputStream("C:\\Users\\Dell\\Desktop\\DataFile.txt");
//		int byteRead = 0;
//		while ((byteRead = fis.read()) != -1) {
//			System.out.println(byteRead);
//			
//			fi.write(byteRead);
//		}
		long size = f.length();
		byte[] b = new byte[10];

		while ((fis.read(b)) != -1) {
			int q=fis.available();
			System.out.println(q);
			fi.write(b,2,5);
		}

		fis.close();
		fi.close();

	}

}
