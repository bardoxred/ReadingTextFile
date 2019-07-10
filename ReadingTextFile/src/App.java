import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the file path: ");

        String fileName = in.next();

        File textFile = new File(fileName);

        Scanner scanner = new Scanner(textFile);

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();

    }
}
