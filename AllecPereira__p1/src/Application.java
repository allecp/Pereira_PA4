import java.util.Scanner;
import java.io.*;




public class Application {



	public static void main(String args[])throws IOException {

		
			DuplicateRemover duplicateRemover=new DuplicateRemover();
			
			FileInputStream InfS=null; 
			PrintWriter outFs=null; 


			try {

				
				InfS=new FileInputStream("problem1.txt");
				
				outFs=new PrintWriter("unique_words.txt");
				
				duplicateRemover.remove(InfS);
				
				duplicateRemover.write(outFs);
				
				
				

			}
			
			catch(IOException e) {
				System.out.println(e.getMessage());
	
			}
			finally {
				//closes input file from remove method
				try {
					if(InfS!=null)
						InfS.close();
					
				//closes output file from write method	
					if(outFs!=null)
						outFs.close();
					
				}
				
				catch(IOException e){
				System.out.println("Error: "+e.getMessage());
				}
			}

	
	
	}

}



