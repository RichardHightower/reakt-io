package io.advantageous.nektwork.http;

import io.advantageous.nektwork.Buffer;
import io.advantageous.nektwork.MultiMap;
import io.advantageous.reakt.Callback;
import io.advantageous.reakt.Stream;
import io.advantageous.reakt.promise.Promise;
import io.advantageous.reakt.promise.Promises;

import java.io.Closeable;
import java.time.Duration;
import java.util.List;


/**
 * This interface was heavily influenced by Vert.x
 *
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface HttpClientResponse extends Closeable {

    HttpClientResponse setResponseStream(Stream<Buffer> handler);

    HttpClientResponse setResponseTextStream(Stream<String> handler);

    HttpClientResponse getBody(Callback<Buffer> bodyHandler);

    HttpClientResponse getBodyAsText(Callback<String> bodyHandler);

    HttpClientResponse resume();

    HttpClientResponse pause();

    int statusCode();

    String statusMessage();

    MultiMap<String, String> getHeaders();

    String getHeader(String headerName);

    String getHeader(CharSequence headerName);

    String getTrailer(String trailerName);

    MultiMap getTrailers();

    List<String> getCookies();

    void close();


    /**
     * Blocking call for testing and legacy integration.
     * Do not use this for async processing.
     * Do not run this in Vert.x if you are running inside of a verticle.
     *
     * @param timeout timeout duration
     * @return HttpClientResponse
     */
    default Buffer getBody(Duration timeout) {
        Promise<Buffer> promise = Promises.blockingPromise(timeout);
        getBody(promise);
        return promise.get();
    }

    /**
     * Blocking call for testing and legacy integration.
     * Do not use this for async processing.
     * Do not run this in Vert.x if you are running inside of a verticle.
     *
     * @return Buffer
     */
    default Buffer getBody() {
        Promise<Buffer> promise = Promises.blockingPromise();
        getBody(promise);
        return promise.get();
    }

    /**
     * Blocking call for testing and legacy integration.
     * Do not use this for async processing.
     * Do not run this in Vert.x if you are running inside of a verticle.
     *
     * @return UTF-8 text
     */
    default String getBodyAsText() {
        return getBody().toString();
    }

    /**
     * Blocking call for testing and legacy integration.
     * Do not use this for async processing.
     * Do not run this in Vert.x if you are running inside of a verticle.
     *
     * @param timeout timeout duration
     * @return UTF-8 text
     */
    default String getBodyAsText(Duration timeout) {
        return getBody().toString();
    }
}

