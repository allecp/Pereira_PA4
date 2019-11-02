
import java.util.Scanner;
import java.io.*;
public class Application {


public static void main(String args[])throws IOException {

DuplicateCounter duplicateCounter=new DuplicateCounter();

FileInputStream infs=null;
PrintWriter outfs=null; 


try {

infs=new FileInputStream("problem2.txt");
outfs=new PrintWriter("unique_word_counts.txt");


duplicateCounter.count(infs);
duplicateCounter.write(outfs);



}
catch(IOException e) {
	System.out.println(e.getMessage());
	
}
finally {
	try {
		//closes input file used in count method
		if(infs!=null)
			infs.close();
		
		//close output file used in write method
		if(outfs!=null)
			outfs.close();
		
	}
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
	
	
	
	
	
}




}




}
