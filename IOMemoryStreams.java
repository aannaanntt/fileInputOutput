package fileobjexample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class IOMemoryStreams {
	
	public static void main(String[] args) throws IOException {
		String mesage = "lets learn about in memroy streams";
		byte[]b=mesage.getBytes();
		byte [] buffer = new byte[3];
		ByteArrayInputStream bas= new ByteArrayInputStream(b,0,10);
		ByteArrayOutputStream nos = new ByteArrayOutputStream();
		int byteRead=0;
		int count=0;
		while((byteRead=bas.read(buffer))!=1){
			for (byte c : buffer) {
				System.out.println(c);
			}
//			if(count==1)
//				bas.mark(5);
//			if(count==2)
//				bas.reset();
		System.out.println(byteRead);
//			count++;
		
		nos.write(buffer);
		}
		bas.close();
		byte[] b1= nos.toByteArray();
		for (byte c : b1) {
			System.out.println(c);
		}
		nos.close();
	}
}
