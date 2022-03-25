package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Files {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Documenti\\temp.dat");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter,true);
        if (file.canWrite()) printWriter.println("This is my first line");
    }
}
