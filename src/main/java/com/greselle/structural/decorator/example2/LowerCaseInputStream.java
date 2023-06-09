package com.greselle.structural.decorator.example2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


// Decorator
public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int length) throws IOException {
        int result = in.read(b, offset, length);

        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return result;
    }
}
