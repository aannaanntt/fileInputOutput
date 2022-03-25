package fileobjexample;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedStreams {
 
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Dell\\Desktop\\MyFile.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int bytes=0;
		try {
			while((bytes=bis.read())!=-1){
				System.out.println(bytes);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
