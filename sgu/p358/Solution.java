// SGU 358 -- Median of Medians
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

class Solver {
    void run(InputReader in, PrintWriter out) throws IOException {
        int[] b = new int[3];
        for (int i = 0; i < 3; ++ i) {
            int[] a = new int[3];
            for (int j = 0; j < 3; ++ j) {
                a[j] = in.nextInt();
            }
            Arrays.sort(a);
            b[i] = a[1];
        }
        Arrays.sort(b);
        out.println(b[1]);
        out.close();
    }
}

public class Solution {
    public static void main(String args[]) {
        try {
            new Solver().run(new InputReader(System.in), new PrintWriter(System.out));
        } catch (IOException e) {
        }
    }
}

class InputReader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    InputReader(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = new StringTokenizer("");
    }

    String nextToken() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
}
