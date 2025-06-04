package Class2;
//최대공약수와 최소공배수
import java.util.*;
import java.io.*;
public class P2609 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a<b){
            int temp;
            temp = a;
            a = b;
            b= temp;
        }
        //최대공약수 찾기
        int tempA= a;
        int tempB =b;
        int R;
        do {
            R = tempA % tempB;
            tempA = tempB;
            tempB = R;
        } while(R != 0);
        int gcd = tempA;
        //최소공배수 찾기
        int aPerGmd = a/gcd;
        int bPerGmd = b/gcd;
        int lcm = aPerGmd * bPerGmd * gcd;
        //출력
        bw.write(gcd +"\n"+ lcm);
        bw.flush();
        bw.close();
    }
}
