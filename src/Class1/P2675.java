package Class1;
//문자열 반복
import java.io.*;
import java.util.*;
public class P2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeatNum = Integer.parseInt(st.nextToken());
            String repeatString = st.nextToken();
            for(int j=0; j<repeatString.length(); j++){
                for(int k=0; k<repeatNum; k++) {
                    bw.write(repeatString.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
