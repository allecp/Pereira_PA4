import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DuplicateRemover {
	
	
	int i=0;
	private Scanner input=null;
	private ArrayList<String>uniqueWords=new ArrayList<String>();
	private LinkedHashSet<String> hashSet = null;
	private ArrayList<String> listWithoutDuplicates=null;
	
	
	
	
	
	
	
	
public void remove(FileInputStream dataFile)throws IOException {
	input=new Scanner(dataFile);
	
	while(input.hasNext()) {
		uniqueWords.add(input.next());
	
	}
	
	hashSet = new LinkedHashSet<>(uniqueWords);
	
	// ArrayList listWithoutDuplicates contains nonrepeated elements from uniqueWords
	listWithoutDuplicates = new ArrayList<>(hashSet);

}


public void write(PrintWriter outPutFile)throws IOException {


	
for(i=0;i<listWithoutDuplicates.size();i++) 
	outPutFile.println(listWithoutDuplicates.get(i));




}

}
