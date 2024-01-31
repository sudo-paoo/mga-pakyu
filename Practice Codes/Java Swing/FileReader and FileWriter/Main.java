import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("path-to-file");
        Scanner sc = new Scanner(file);
        String content = "";
        while (sc.hasNextLine()) {
            content = content.concat(sc.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("path-to-new-file");
        writer.write(content);
        writer.close();
    }
}