package fileobjexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TheNeed {
	
	public static void main(String[] args) throws IOException {
		// FileReader = read the contents of a file as a stream of characters. 
				  //read() returns an int value which contains the byte value
				  //when read() returns -1, there is no more data to be read
				  
				  try {
				   FileReader reader = new FileReader("C:\\Users\\Dell\\Desktop\\DataFile.txt");
				   int data = reader.read();
				   while(data != -1) {
				    System.out.print((char)data);
				    data = reader.read();
				   }
				   reader.close();
				   
				  } catch (FileNotFoundException e) {
				   // TODO Auto-generated catch block
				   e.printStackTrace();
				  } catch (IOException e) {
				   // TODO Auto-generated catch block
				   e.printStackTrace();
				  }
		
	}

}
