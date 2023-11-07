import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\user\\IdeaProjects\\create files\\input.txt"); // Specify the source file path
            out = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\create files\\files\\output.txt"); // Specify the destination file path
            int content;
            while ((content = in.read()) != -1) {
                out.write((byte) content);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
