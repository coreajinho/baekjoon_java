package Class1;
//최소,최대
import java.util.*;
import java.io.*;
public class P10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = min;
        for(int i=0; i<n-1; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(min > temp) min = temp;
            if(max < temp) max = temp;
        }
        bw.write(String.format("%d %d", min, max));
        bw.flush();
        bw.close();
    }
}
