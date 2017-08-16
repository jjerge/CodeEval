
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
       
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
           int temp=Integer.parseInt(line);
System.out.println(solve(x));


}
}
 public static int solve(int n) {
	    	if (n <= 1) 
	    		return n;
	    	else
	    		return solve(n-1) + solve(n-2);	
	    }
        }
    
