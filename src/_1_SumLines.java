import  java.io.*;

public class _1_SumLines {


    public static void main(String[] args) throws IOException{
        FileReader inFile = new FileReader("res/input.txt");
        BufferedReader in = new BufferedReader(inFile);

        String line;
        int sum = 0;

        while ( (line = in.readLine()) != null ) {
            for (int i = 0; i < line.length(); i++) {
                sum += line.charAt(i);
            }
            System.out.println(sum);
            sum = 0;
        }
    }

}
