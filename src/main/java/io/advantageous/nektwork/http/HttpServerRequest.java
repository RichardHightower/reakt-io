package io.advantageous.nektwork.http;

import io.advantageous.nektwork.Buffer;
import io.advantageous.nektwork.MultiMap;
import io.advantageous.nektwork.http.websocket.ServerWebSocket;
import io.advantageous.reakt.Callback;
import io.advantageous.reakt.Observer;
import io.advantageous.reakt.Stream;

import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.cert.X509Certificate;
import java.net.SocketAddress;


/**
 * This interface was heavily influenced by Vert.x
 *
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface HttpServerRequest {


    HttpServerRequest setBodyStream(Stream<Buffer> bodyStream);

    HttpServerRequest setBodyObserver(Observer<Buffer> bodyObserver);

    HttpServerRequest getBody(Callback<Buffer> bodyCallback);

    HttpServerRequest getBodyAsText(Callback<String> bodyCallback);


    HttpVersion getVersion();

    HttpMethod getMethod();

    boolean isSSL();

    String getUri();

    String getPath();

    String getQuery();

    HttpServerResponse getResponse();

    MultiMap<String, String> getHeaders();

    String getHeader(String headerName);

    String getHeader(CharSequence headerName);

    MultiMap<String, String> getParams();

    String getParam(String paramName);

    SocketAddress getRemoteAddress();

    SocketAddress getLocalAddress();

    X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException;

    String getAbsoluteURI();

    boolean isExpectMultipart();

    HttpServerRequest setExpectMultipart(boolean expect);

    MultiMap<String, String> getFormAttributes();

    String getFormAttribute(String attributeName);

    ServerWebSocket upgrade();

    boolean isEnded();
}
