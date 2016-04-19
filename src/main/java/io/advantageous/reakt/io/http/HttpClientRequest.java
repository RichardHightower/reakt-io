package io.advantageous.reakt.io.http;

import io.advantageous.reakt.io.Buffer;
import io.advantageous.reakt.io.MultiMap;
import io.advantageous.reakt.Callback;
import io.advantageous.reakt.promise.Promise;
import io.advantageous.reakt.promise.Promises;

import java.io.Closeable;
import java.nio.charset.Charset;
import java.time.Duration;


/**
 * This interface was heavily influenced by Vert.x
 *
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface HttpClientRequest extends Closeable {

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

    default HttpClientRequest end() {
        close();
        return this;
    }

    void close();

    HttpClientRequest setTimeout(long timeoutMs);


    /**
     * Blocking call for testing and legacy integration.
     * Do not use this for async processing.
     * Do not run this in Vert.x if you are running inside of a verticle.
     *
     * @return HttpClientResponse
     */
    default HttpClientResponse getResponse() {
        final Promise<HttpClientResponse> promise = Promises.blockingPromise();
        getResponse(promise);
        return promise.get();
    }

    /**
     * Blocking call for testing and legacy integration.
     * Do not use this for async processing.
     * Do not run this in Vert.x if you are running inside of a verticle.
     *
     * @param timeout timeout duration
     * @return HttpClientResponse
     */
    default HttpClientResponse getResponse(Duration timeout) {
        final Promise<HttpClientResponse> promise = Promises.blockingPromise(timeout);
        getResponse(promise);
        return promise.get();
    }


}

