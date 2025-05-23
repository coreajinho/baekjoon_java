package Class1;
//아스키 코드
import java.io.*;
import java.util.*;
public class P11654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        System.out.printf("%d", (int)a.charAt(0));
    }
}
