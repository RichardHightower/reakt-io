package io.advantageous.nektwork.http;

import io.advantageous.nektwork.Buffer;
import io.advantageous.nektwork.MultiMap;

import io.advantageous.reakt.Callback;

import java.io.Closeable;
import java.nio.charset.Charset;


/**
 * This interface was heavily influenced by Vert.x
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface HttpClientRequest extends Closeable{

    HttpClientRequest write(Buffer data);
    HttpClientRequest setWriteQueueMaxSize(int maxSize);


    HttpClientRequest getResponse(Callback<HttpClientResponse> handler);

    HttpClientRequest pause();
    HttpClientRequest resume();

    boolean isChunked();
    HttpClientRequest setChunked(boolean chunked);
    HttpMethod getMethod();
    String getUri();
    MultiMap<String, String> getHeaders();
    HttpClientRequest putHeader(String name, String value);
    HttpClientRequest putHeader(CharSequence name, CharSequence value);
    HttpClientRequest putHeader(String name, Iterable<String> values);
    HttpClientRequest putHeader(CharSequence name, Iterable<CharSequence> values);
    HttpClientRequest write(String chunk);
    HttpClientRequest write(String chunk, Charset enc);
    void writeEnd(String chunk);
    void writeEnd(String chunk, Charset encoding);
    void writeEnd(Buffer chunk);
    void close();
    HttpClientRequest setTimeout(long timeoutMs);

}

