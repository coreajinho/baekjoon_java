package Class1;
import java.io.*;
public class P2753 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if((n%4 ==0 && n%100 !=0)||n%400 ==0) bw.write("1");
        else bw.write("0");
        bw.flush();
        bw.close();
    }
}
