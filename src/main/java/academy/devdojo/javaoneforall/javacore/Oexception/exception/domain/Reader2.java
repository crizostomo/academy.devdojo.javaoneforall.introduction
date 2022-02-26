package academy.devdojo.javaoneforall.javacore.Oexception.exception.domain;

//103 - Exceptions pt 09 - Try with resources

import java.io.Closeable;
import java.io.IOException;

public class Reader2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing reader 2");
    }
}
