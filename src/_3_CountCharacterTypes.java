import java.io.*;

public class _3_CountCharacterTypes  {
    public static void main(String[] args) throws IOException {
        FileReader inFile = new FileReader("res/words.txt");
        BufferedReader in = new BufferedReader(inFile);

        FileWriter outFile = new FileWriter("res/count-chars.txt");
        PrintWriter out = new PrintWriter(outFile);

        String line;
        int vowelCount = 0;
        int consonants = 0;
        int punctMarks = 0;

        while ((line = in.readLine()) != null) {
            line.toLowerCase();
            for (int i = 0; i < line.length(); i++) {
                char a = line.charAt(i);
                if (a == '?' | a== '.' | a== ',' | a== '!'){
                    punctMarks++;
                }else if (a=='a'|a=='e'|a=='i'|a=='o'|a=='u'){
                    vowelCount++;
                }else if (a!=' '){
                    consonants++;
                }
            }
            out.println("Vowels: " + vowelCount );
            out.println("Consonants: " + consonants );
            out.println("Punctuation: " + punctMarks );
        }
        in.close();
        out.close();
    }
}

