package fileobjexample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class FileReaderAndFileWriter {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Dell\\Desktop\\DataFile.txt");
		File writeFile = new File("src\\JavaWiki.txt");

		Reader fr = Reader.nullReader();
		Writer write = Writer.nullWriter();
		try {

			writeFile.createNewFile();

			fr = new FileReader(file, StandardCharsets.UTF_8);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// System.out.println(Charset.defaultCharset());
			
		char[] newCharArray = new char[1024];

		try {
			fr.skip(10);
			while ((fr.read(newCharArray)) != -1) {
//				if((char)charRead=='I') {
//					break;
//				}
			
				for (int i = 0; i < newCharArray.length; i++) {
					System.out.print(newCharArray[i]);
				}
				
				

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				write.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
