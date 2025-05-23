package Class1;

import java.io.*;

public class P2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i= 0; i<9; i++){
            bw.write(n + " * " + (i+1) + " = " + n*(i+1)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
