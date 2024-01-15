import java.util.*;
import java.io.*;

public class Prob01 {

    static String file = "Prob01";
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
    }
    
    static void solve() throws IOException {
        
        StringBuilder sb = new StringBuilder();
            
        for(int i=0; i<n; i++){
            if(in.nextInt()>=70) sb.append("PASS").append("\n");
            else sb.append("FAIL").append("\n");
        }
        
        out.print(sb.toString());
    }
}