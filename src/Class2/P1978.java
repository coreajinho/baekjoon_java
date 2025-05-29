package Class2;
//소수 찾기
import java.util.*;
import java.io.*;
public class P1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int primeNum = inputNum;
        for(int i =0; i<inputNum;i++){
            int n = Integer.parseInt(st.nextToken());
            if(n==1){
                primeNum--;
                continue;
            }
            if(n==2) continue;
            for(int j=2; j*j<=n; j++){
                if(n%j ==0) {
                    primeNum--;
                    break;
                }
            }
        }
        bw.write(primeNum +"");
        bw.flush();
        bw.close();
    }
}
