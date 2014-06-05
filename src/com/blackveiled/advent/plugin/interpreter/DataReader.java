package com.blackveiled.advent.plugin.interpreter;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Blackveiled
 */
public class DataReader {

    File read = null;
    FileInputStream input = null;
    InputStream in;

    /**
     * Reads the bytes from a data file and imports them to the server.
     *
     * @param Path
     * @throws FileNotFoundException
     * @throws IOException
     */
    public DataReader(String Path) throws FileNotFoundException, IOException {
        read = new File(Path);

        // Read 8 kilobytes per iteration
        in = new BufferedInputStream(new FileInputStream(read), 8 * 1024);

        while (in.read() != -1) {

        }
    }

    public DataReader(File file) throws FileNotFoundException, IOException {
        read = file;
        this.input = new FileInputStream(read);
    }

}
