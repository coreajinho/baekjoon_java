package Class1;
import java.io.*;
public class P9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char grade;
        if(score >=90) grade = 'A';
        else if(score >=80) grade = 'B';
        else if(score >=70) grade = 'C';
        else if(score >=60) grade = 'D';
        else grade = 'F';
        bw.write(grade +"\n");
        bw.flush();
    }
}
