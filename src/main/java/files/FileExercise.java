package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;

public class FileExercise extends File {

    public FileExercise(String pathname) {
        super(pathname);
    }

    public FileExercise(String parent, String child) {
        super(parent, child);
    }

    public FileExercise(File parent, String child) {
        super(parent, child);
    }

    public FileExercise(URI uri) {
        super(uri);
    }

    public File creaTextFile(String nomeFile, String parentDir) {
        File file = new File(parentDir);
        ;
        return file;
    }

    public Boolean writeToFile(String text, File destFile) throws IOException {
        FileWriter fileWriter = new FileWriter(destFile);
        PrintWriter printWriter = new PrintWriter(fileWriter, true);
        if (destFile.canWrite()) {
            printWriter.println(text);
            return true;
        } else return false;
    }

    public static void main(String[] args) {

    }
}
