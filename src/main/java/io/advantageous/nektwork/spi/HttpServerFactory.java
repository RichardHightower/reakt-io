package io.advantageous.nektwork.spi;

import io.advantageous.nektwork.Context;
import io.advantageous.nektwork.http.HttpServer;
import io.advantageous.nektwork.options.http.HttpServerOptions;

public interface HttpServerFactory {

    HttpServer createHttpServer(HttpServerOptions options);

    HttpServer createHttpServer(Context context, HttpServerOptions options);
}
