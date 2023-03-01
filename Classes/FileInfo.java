import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileInfo {
	public static void main (String[]args) {
		
		File f = new File ("Testing.txt");//filename passed to constructr
		if(f.exists() ){
			System.out.println("Filename is: " + f.getName());
			System.out.println("Path is: " + f.getAbsolutePath());
			System.out.println("Readable : " + f.canRead());
			System.out.println("Writable is: " + f.canWrite());
			System.out.println("File size is: " + f.length());
		}else {
			System.out.print("Filename does not exist..#! ");
		}
	
		
	}
}
/*java.io.File
 * java.io.IoExcptn
 * psvm{
 * File f = new File ("filename  shud be passed with .txt)
 * if(f.exixts()){
 * f.getName, f.canRead/canWrite, f.length
 * for deletion: f.delete()
 */
