package week8;

import java.io.*;

public class Utils {
	private static BufferedReader data;
	
	public static String readContentFromFile(String path) {
		String s;
		try{		
			data = new BufferedReader(new FileReader(path));
			while((s = data.readLine()) != null){
				System.out.print(s + "\n");
			}	
			data.close();
		}
		catch(FileNotFoundException e){
			return "Unable to open file";
		}
		catch(IOException e){
			return "Error reading file";
		}	
		return null;
	}
	public static void writeContentToFile(String path) {
		try {	
			File file = new File(path);
			BufferedWriter data = new BufferedWriter(new FileWriter(file));
			data.write("Hello World");
			data.close();
		}
		catch(IOException e){
			System.out.println("Error writing file");
		}
	}
	public static void writeContentToFile2(String path) {
		try {	
			File file = new File(path);
			BufferedWriter data = new BufferedWriter(new FileWriter(file, true));
			data.write("Hello World\n");
			data.close();
		}
		catch(IOException e){
			System.out.println("Error writing file");
		}
	}
	public static File findFileByName(String folderPath, String fileName){
		try {
		    File file = new File(folderPath);
		    String[] listFolder = file.list();
		    if (listFolder == null) {
		       System.out.println("does not exist or is not a directory");
		    }
		    else {
		       for (int i = 0; i < listFolder.length;) {
		          if (fileName == listFolder[i]);
		          	return new File(folderPath + fileName);
		       }
		    }
		}
		catch(Exception e){
			System.out.print("Unable to open file");
		}
	    return null;
	}
	public static void main(String[] args){
		readContentFromFile("E:\\eclispe_workspace\\JavaClass\\src\\week8\\Utils.java");
		writeContentToFile("E:\\eclispe_workspace\\JavaClass\\src\\week8\\file_out.txt");
		writeContentToFile2("E:\\eclispe_workspace\\JavaClass\\src\\week8\\file_out.txt");
		System.out.print(findFileByName("E:\\eclispe_workspace\\JavaClass\\src\\week8\\", "Utils.java"));
	}
}
