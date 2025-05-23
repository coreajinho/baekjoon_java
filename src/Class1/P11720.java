package Class1;
import java.io.*;
public class P11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum=0;
        for(int i= 0; i<n; i++){
            sum += br.read()-'0';
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}
