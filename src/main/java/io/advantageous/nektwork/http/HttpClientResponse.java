package io.advantageous.nektwork.http;

import io.advantageous.nektwork.Buffer;
import io.advantageous.nektwork.MultiMap;
import io.advantageous.reakt.Callback;
import io.advantageous.reakt.Stream;

import java.io.Closeable;
import java.util.List;


/**
 * This interface was heavily influenced by Vert.x
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

}

