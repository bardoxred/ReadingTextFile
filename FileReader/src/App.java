import java.io.*;

public class App {
    public static void main(String[] args) {

        File fileName = new File("src/text.txt");
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String text;
            while((text = bufferedReader.readLine())!= null){
                System.out.println(text);
            }
            bufferedReader.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName.toString());
        }
        catch (IOException e) {
            System.out.println("Unable to read file: " + fileName.toString());
        }


    }
}
