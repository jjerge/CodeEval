
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
     String[] hello=line.split(" ");
int x=Integer.parseInt(hello[0]);
int z=Integer.parseInt(hello[2]);
int y=Integer.parseInt(hello[1]);
for(int i=1;i<=z;i++){
String result="";
if(i%x==0){
	result ="F";
}
if(i%y==0){
	result +="B";
}
if(result.length()==0){
	result+=i;
}
if(x<z){
System.out.print(result+" ");
}
else{
System.out.print(result);    
} 
    
}
System.out.println();
   
}
}
}
