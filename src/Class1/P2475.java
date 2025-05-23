package Class1;
import java.io.*;
import java.util.*;
public class P2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int d= Integer.parseInt(st.nextToken());
        int e= Integer.parseInt(st.nextToken());
        double squareSum = Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)+Math.pow(d,2)+Math.pow(e,2);
        int check = (int)squareSum%10;
        bw.write(String.valueOf(check));
        bw.flush();
    }
}
