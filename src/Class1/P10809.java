package Class1;
//알파벳 찾기
import java.io.*;
import java.util.*;
public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<'z'-'a'+1; i++) {
            char x = (char)(i+'a');
            int position = -1;
            for(int j=0; j<word.length(); j++){
                if(x == word.charAt(j)) {
                    position = j;
                    break;
                }
            }
            sb.append(position+" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
