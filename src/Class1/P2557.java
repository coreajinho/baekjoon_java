package Class1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P2557 {
    public static void main(String[] args) throws IOException {
        BufferedWriter br = new BufferedWriter((new OutputStreamWriter(System.out)));
        br.write("Hello World!");
        br.flush();
        br.close();
    }
}
