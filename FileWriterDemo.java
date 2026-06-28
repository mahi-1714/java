import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student.txt");
            writer.write("Name: Rahul\n");
            writer.write("Course: Java Programming\n");
            writer.write("Marks: 90");
            writer.close();

            System.out.println("Data written successfully.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
