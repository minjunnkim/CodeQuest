import java.util.*;
import java.io.*;

public class Prob02 {

    static String file = "Prob02";
    static Scanner in;
    static PrintWriter out;
    
    static int n;
    
    public static void main(String[] args)throws IOException{
        
        in = new Scanner(new File(file+".in.txt"));
        out = new PrintWriter(new File("out.txt"));
        
        init();
        solve();
        
        in.close();
        out.close();

        Check.check(file+".out.txt");
    }
    
    static void init() {
           n = in.nextInt();
           in.nextLine();
    }
    
    static void solve() throws IOException {
        for(int i = 0; i < n; i++) {
        	String str = in.nextLine();
        	int count = 0;
        	
        	for(int j = 0; j < str.length(); j++) {
        		if(str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u') {
        			count++;
        		}
        	}
        	out.println(count);
        }
        
    }
}