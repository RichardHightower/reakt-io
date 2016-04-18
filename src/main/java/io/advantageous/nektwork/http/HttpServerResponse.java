package io.advantageous.nektwork.http;

import io.advantageous.nektwork.Buffer;
import io.advantageous.nektwork.MultiMap;

import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.function.Consumer;


/**
 * This interface was heavily influenced by Vert.x
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface HttpServerResponse extends Closeable {

    HttpServerResponse setExceptionHandler(Consumer<Throwable> handler);

    HttpServerResponse write(Buffer data);

    HttpServerResponse write(String string);

    HttpServerResponse write(String string, Charset encoding);

    HttpServerResponse setWriteQueueMaxSize(int maxSize);

    int getStatusCode();

    HttpServerResponse setStatusCode(int statusCode);

    String getStatusMessage();

    HttpServerResponse setStatusMessage(String statusMessage);

    boolean isChunked();

    HttpServerResponse setChunked(boolean chunked);

    MultiMap<String, String> getHeaders();

    HttpServerResponse putHeader(String name, String value);
    HttpServerResponse putHeader(CharSequence name, CharSequence value);
    HttpServerResponse putHeader(String name, Iterable<String> values);
    HttpServerResponse putHeader(CharSequence name, Iterable<CharSequence> values);
    MultiMap<String, String> getTrailers();
    HttpServerResponse putTrailer(String name, String value);
    HttpServerResponse putTrailer(CharSequence name, CharSequence value);
    HttpServerResponse putTrailer(String name, Iterable<String> values);
    HttpServerResponse putTrailer(CharSequence name, Iterable<CharSequence> value);

    HttpServerResponse closeHandler(Runnable closeHandler);
    HttpServerResponse writeContinue();

    void writeEnd(String chunk);
    void writeEnd(String chunk, String enc);
    void writeEnd(Buffer chunk);
    void end();

    void close();
    boolean ended();
    boolean closed();
    boolean headWritten();

    HttpServerResponse setHeadersEndHandler(Runnable handler);
    HttpServerResponse setBodyEndHandler(Runnable handler);
    long bytesWritten();
}

