package io.advantageous.nektwork.http;


import com.sun.xml.internal.ws.Closeable;
import io.advantageous.nektwork.http.websocket.ServerWebSocket;
import io.advantageous.reakt.Callback;
import io.advantageous.reakt.Stream;


/**
 * This interface was heavily influenced by Vert.x
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface HttpServer extends Closeable {

    HttpServer setRequestStream(Stream<HttpServerRequest> stream);
    HttpServer setWebsocketStream(Stream<ServerWebSocket> handler);
    HttpServer listen(Callback<HttpServer> listenHandler);
    void close(Callback<Void> closedHandler);
    void close();

}

