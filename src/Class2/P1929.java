package Class2;
//소수 구하기
import java.io.*;
import java.util.*;
public class P1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        for(int i =0; i<n; i++){
            if(isPrime[i]== true){
                for(int j=i+(i+1); j<n; j+=(i+1)){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=m-1; i<n; i++){
            if(isPrime[i] == true){
                bw.write((i+1)+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}

