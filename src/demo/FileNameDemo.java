package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FileNameDemo {
	public static void main(String[] args) throws Exception {

//		 List<String> list = readTxtFileIntoStringArrList("2014");
//		 System.out.println(list);

		renameFiles("2014");
	}

	public static void renameFiles(String year) throws Exception {

		File nameFile = new File("d:/javaDemo/typs" + year + "(2).txt");
		InputStreamReader read = new InputStreamReader(new FileInputStream(nameFile), "UTF-8");// 考虑到编码格式
		BufferedReader bufferedReader = new BufferedReader(read);
		String lineTxt = null;

		File dir = new File("d:/" + year);
		File[] files = dir.listFiles();
		
		int i = files.length - 1; 
		while ((lineTxt = bufferedReader.readLine()) != null) {
			files[i].renameTo(new File("d:/" + year + "/" + lineTxt));
			i--;
		}
		
		System.out.println(files.length);
	}

	public static List<String> readTxtFileIntoStringArrList(String year) {
		List<String> list = new ArrayList<String>();
		try {
			String encoding = "UTF-8";
			File file = new File("d:/javaDemo/typs" + year + ".txt");
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);

				String path = "d:/javaDemo/typs" + year + "(2).txt";
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, false)));
				String lineTxt = null;

				int i = 0;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					if (i % 2 == 0) {
						list.add(lineTxt);
					}
					i++;
				}
				
				for(int j=0; j<list.size(); j++) {
					if (j != list.size() - 1) {
						out.write(list.get(j) + "\r\n");
					} else {
						out.write(list.get(j));
					}
				}
				bufferedReader.close();
				read.close();
				out.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}

		return list;
	}
}
