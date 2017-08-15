// Sample code to read in test cases:
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String result = ""; 
			            
						 String[] current = line.split(" ");
						 for (int i = current.length - 1; i >= 0; i--) {
							 result += current[i] + " ";
						 }
						 //System.out.println(line.split("[ \t]+"));
						 System.out.println(result.trim()); 
        }
    }
}
