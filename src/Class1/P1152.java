package Class1;
//단어의 개수

import java.io.*;
import java.util.StringTokenizer;

public class P1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num=0;
        while(st.hasMoreTokens()){
            String a = st.nextToken();
            num++;
        }
        bw.write(num + "\n");
        bw.flush();
        bw.close();
    }
}
