package project2;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileCopy {
	
	
	  public static void main(String[] args) {

		  byte[] string = new byte[50];
	    try {
	      FileInputStream sourceFile = new FileInputStream("C:\\Users\\00005811\\eclipse-workspace\\project2\\src\\ptoject2\\FileSteamTest");
	      FileOutputStream destFile = new FileOutputStream("C:\\Users\\00005811\\eclipse-workspace\\project2\\src\\project2\\copyFile");

	      
	      sourceFile.read(string);
	      destFile.write(string);
          sourceFile.close();
	      destFile.close();
	      destFile.flush();
	    }
	    catch (Exception e) {
	    	 System.out.println("The input.txt file is copied to newFile.");
	    }
	  }
	}


