package Day12;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileAndWriteName {
    public static void main(String[] args) {
        String fileName = "name.txt";
        String name = "Gnanapraksh";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(name);
            writer.close();
           System.out.println("FileName:" + fileName + " File Name is Created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
