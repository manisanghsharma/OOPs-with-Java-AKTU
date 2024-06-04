import java.io.*;

public class File {
public static void main(String[] args) {
char[] c = new char[128]; 
int cLen = c.length;
// Example use of InputStream methods
try {
	FileReader fr = new FileReader("/Users/manisanghsharma/Documents/Java/File IO/1.txt");

	

int count = 0;
int read = 0;
while ((read = fr.read(c)) != -1) {

}
System.out.println("Wrote: " + count + " characters.");
} catch (FileNotFoundException f) {
System.out.println("File " + args[0] + " not found.");
} catch (IOException e) {
System.out.println("IOException: " + e);
}}}