package demo;

import java.io.File;
import java.io.IOException;

public class GameLIstMaker {

	public static void main(String[] args) throws IOException {
		
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("d:/gamelist.txt"), "utf-8");
//		BufferedReader br = new BufferedReader(isr);
//		FileReader fr = new FileReader("d:/gamelist.txt");
		
//		BufferedReader br = new BufferedReader();
		
//		String line = null; 
//		while((line = br.readLine()) != null) {
//			String gameOrder = line.substring(0, 4);
//			String gameName = line.substring(7);
//			System.out.println(gameOrder + "@" + gameName);
//		}
		
		File dir = new File("d:/GBA ROM Test");
		
		File[] listFiles = dir.listFiles();
		System.out.println(listFiles.length);
//		for(int i=0; i<listFiles.length; i++) {
//			listFiles[i].renameTo(new File("aa" + i));
//		}
	}
}
