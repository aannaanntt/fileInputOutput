package fileobjexample;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FileApi {

	public static void main(String[] args) throws IOException  {
		File v = new File("C:\\Users\\Dell\\Desktop\\MyFile.txt");

//		File  v1= new File(v,"MyFile.txt");
//		
//		File  v2= new File("C:\\Users\\Dell\\Desktop","MyFile.txt");
//		URI uri = new URI("");
//		File  v3= new File(uri);

		System.out.println(v.exists());

		File dir = new File("C:\\Users\\Dell\\Desktop\\MyDocuments");
		
		File dir1 = new File(dir,"rn");
		File dir2 = new File(dir,"rn1");
		
		File v32 = new File(dir,"MyFile.txt");

		v32.createNewFile();
		System.out.println(dir.exists());

		dir.mkdir();
		dir1.mkdir();
		dir2.mkdir();
		System.out.println(dir.exists());
		
		System.out.println(v32.exists());
		
		String[] totalFiles=dir.list();
		int files=0;
		int dirs=0;
	for (int i = 0; i < totalFiles.length; i++) {
		if(new File(dir,totalFiles[i]).isFile()) {
			files++;
			System.out.println(totalFiles[i]+" ");
		}else {
			dirs++;
		}
		
	}
	
	System.out.println(files);
	System.out.println(dirs);
	long length=v.length();
	System.out.println(length);
	
	//Path;
	System.out.println(v.getPath());
	System.out.println(v.getAbsolutePath());
	System.out.println(v.getCanonicalPath());
	System.out.println(dir1.getParent());
	}
}
