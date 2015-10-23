import java.io.*;

public class _2_AllCapitals  {
    public static void main(String[] args) throws IOException {
        FileReader inFile = new FileReader("res/input.txt");
        BufferedReader in = new BufferedReader(inFile);

        FileWriter outFile = new FileWriter("res/output.txt");
        PrintWriter out = new PrintWriter(outFile);

        String line;
        while ((line = in.readLine()) != null) {
            out.println(line.toUpperCase());
        }
        in.close();
        out.close();
    }
}

