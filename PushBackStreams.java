package fileobjexample;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class PushBackStreams {

	public static void main(String[] args) throws IOException {
		String s = "if(a && b) return c & d";
		byte[] arr = s.getBytes();
		InputStream in = new ByteArrayInputStream(arr);
		PushbackInputStream filter = new PushbackInputStream(in);
		int b = 0;
		while ((b = filter.read()) != -1) {
			switch (b) {
			case '&':
				if ((b=filter.read()) == '&') {
					System.out.print("LOGICAL");
				} else {
					System.out.print("Bitwise");
					filter.unread(b);
				}
				break;
			default:
				System.out.print((char) b);
				break;
			}
		}

	}
}
