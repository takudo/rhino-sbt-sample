package com.example;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: takudo
 * Date: 15/08/11
 * Time: 23:39
 */
public class StdoutSnatcher extends PrintStream {

    private BufferedReader buffer = new BufferedReader(new StringReader(""));

    public StdoutSnatcher() {
        super(new ByteArrayOutputStream());
    }

    /**
     * コピペコード
     * http://d.hatena.ne.jp/kencoba/20120831/1346398388
     */
    public String readLine() {
        try {
            String line = "";
            if ((line = buffer.readLine()) != null) {
                return line;
            } else {
                buffer = new BufferedReader(new StringReader(out.toString()));
                ((ByteArrayOutputStream) out).reset();
                return buffer.readLine();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
