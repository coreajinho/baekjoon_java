package Class2;
//좌표 정렬하기
import java.io.*;
import java.util.*;
public class P11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[][] array = new int[num][2];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        // 핵심 정렬 부분
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]); // x가 같을 때는 y 비교
                }
                return Integer.compare(a[0], b[0]); // x 비교
            }
        });

        for (int i = 0; i < num; i++) {
            bw.write(array[i][0] + " " + array[i][1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
