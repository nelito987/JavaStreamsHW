import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _5_SaveAnArrayOfDoubles {

    public static void main(String args[]){

        try {

            Scanner scanner = new Scanner(System.in);
            List<Double> numbers = new ArrayList<>();

            while(scanner.hasNext()){
                double num = scanner.nextDouble();
                numbers.add(num);
            }

            ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    "res/doubles.list")));
            oos.writeObject(numbers);

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
