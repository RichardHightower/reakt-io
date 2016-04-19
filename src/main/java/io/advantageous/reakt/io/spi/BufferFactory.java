package io.advantageous.reakt.io.spi;

import io.advantageous.reakt.io.Buffer;

import java.nio.charset.Charset;

public interface BufferFactory {


    Buffer createBuffer(int initialSize);

    Buffer createBuffer();

    Buffer createBuffer(String string);

    Buffer createBuffer(String string, Charset encoding);

    Buffer createBuffer(byte[] bytes);

    Buffer createBuffer(Buffer buffer);
}
