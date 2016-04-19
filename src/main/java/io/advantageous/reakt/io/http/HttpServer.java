package io.advantageous.reakt.io.http;


import io.advantageous.reakt.io.http.websocket.ServerWebSocket;
import io.advantageous.reakt.io.spi.FactoryHelper;
import io.advantageous.reakt.io.spi.HttpServerFactory;
import io.advantageous.reakt.Callback;
import io.advantageous.reakt.Stream;

import java.io.Closeable;


/**
 * This interface was heavily influenced by Vert.x
 *
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface HttpServer extends Closeable {

    HttpServerFactory httpServerFactory = FactoryHelper.loadFactory(HttpServerFactory.class);

    static HttpServerFactory getHttpServerFactory() {
        return httpServerFactory;
    }


    HttpServer setRequestStream(Stream<HttpServerRequest> stream);

    HttpServer setWebSocketStream(Stream<ServerWebSocket> handler);

    HttpServer listen(Callback<HttpServer> listenHandler);

    void close(Callback<Void> closedHandler);

    void close();

}

