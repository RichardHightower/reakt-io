package io.advantageous.nektwork.http;


import java.io.Closeable;


/**
 * This interface was heavily influenced by Vert.x
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface HttpClient extends Closeable{


    /**
     * Creates an HTTP request to send.
     *
     * @param method     the HTTP method
     * @param requestURI the relative URI
     * @return an HTTP client request object
     */
    HttpClientRequest createRequest(HttpMethod method, String requestURI);

    void close();

}
