package io.advantageous.nektwork.spi;

import io.advantageous.nektwork.Buffer;

import java.nio.charset.Charset;

public interface BufferFactory {


    Buffer createBuffer(int initialSize);

    Buffer createBuffer();

    Buffer createBuffer(String string);

    Buffer createBuffer(String string, Charset encoding);

    Buffer createBuffer(byte[] bytes);

    Buffer createBuffer(Buffer buffer);
}
