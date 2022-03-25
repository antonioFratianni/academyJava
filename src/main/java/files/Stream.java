package files;

import java.io.IOException;

public interface Stream <K> {

    void write() throws IOException;
    K read() throws IOException, ClassNotFoundException;
}
