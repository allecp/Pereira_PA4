import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;

import java.io.*;
public class DuplicateCounter {

	HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	
	
	
	private Scanner inputReader=null;
	private ArrayList<String>StringsInFile=new ArrayList<String>();
	private  int wordCounter; 
	private int i=0;
	
	public void count(FileInputStream dataFile)throws IOException {
		
	
		inputReader=new Scanner(dataFile);
		
		while(inputReader.hasNext()) 
			StringsInFile.add(inputReader.next());
		
		for(i=0;i<StringsInFile.size();i++) {
			wordCounter=Collections.frequency(StringsInFile,StringsInFile.get(i));
			hmap.put(StringsInFile.get(i), wordCounter);
			
			
			
		}
	}


public void write(PrintWriter outputFile)throws IOException{
	hmap.forEach((k,v)->outputFile.println(k+" "+v));	
		
}

}