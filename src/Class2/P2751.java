package Class2;
//수 정렬하기2
import java.io.*;
import java.util.*;
public class P2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        StringBuilder st = new StringBuilder();
        Arrays.sort(array);
        for (int i = 0; i < num; i++) {
            st.append(array[i] + "\n");
        }
        bw.write(st.toString());
        bw.flush();
        bw.close();
    }
}
