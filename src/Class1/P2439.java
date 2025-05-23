package Class1;

import java.io.*;

//별찍기-2
public class P2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<=n; i++) {
            for(int k=1; k<=n-i; k++){
                bw.write(" ");
            }
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
