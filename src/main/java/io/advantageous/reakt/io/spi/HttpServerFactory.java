package io.advantageous.reakt.io.spi;

import io.advantageous.reakt.io.Context;
import io.advantageous.reakt.io.http.HttpServer;
import io.advantageous.reakt.io.options.http.HttpServerOptions;

public interface HttpServerFactory {

    HttpServer createHttpServer(HttpServerOptions options);

    HttpServer createHttpServer(Context context, HttpServerOptions options);
}
