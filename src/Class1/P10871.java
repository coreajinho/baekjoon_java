package Class1;
//X보다 작은 수
import java.io.*;
import java.util.StringTokenizer;

public class P10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        int[] a= new int[n];
        for(int i=0; i<n; i++){
            a[i]=Integer.parseInt(st2.nextToken());
        }
        for(int i=0; i<n; i++){
            if(a[i]<x) bw.write(a[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
