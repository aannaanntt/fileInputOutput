package fileobjexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreams {

	public static void main(String[] args) throws IOException {
		File fin = new File("C:\\Users\\Dell\\Desktop\\MyFile.txt");
		File outFile = new File("C:\\Users\\Dell\\Desktop\\outFile.txt");
		outFile.createNewFile();
		try (FileInputStream fis = new FileInputStream(fin)) {
			try (FileOutputStream fOut = new FileOutputStream(outFile)) {
				PipedInputStream pii = new PipedInputStream();
				try (PipedOutputStream pos = new PipedOutputStream(pii)) {
					Runnable writeToPipe = () -> {

						int storeByte = 0;
						int c=0;
						try {
							while ((storeByte = fis.read()) != -1) {
								if(c==1024) {
									System.out.println("1024 bytes processed");
								}
								pos.write(storeByte);
								System.out.println(storeByte);
								c++;
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					};

					Runnable readFromPipe = () -> {
						int storeBytes = 0;
						try {
							while ((storeBytes = pii.read()) != -1)
								
							{
								Thread.sleep(1000);
								System.out.println("Processed" + " " + storeBytes);
								fOut.write(storeBytes);
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					};
					new Thread(writeToPipe).start();
					new Thread(readFromPipe).start();
				}
			}
		}
	
		


	}
}
