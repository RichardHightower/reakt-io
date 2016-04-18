package io.advantageous.nektwork.http.websocket;

import io.advantageous.nektwork.Buffer;
import io.advantageous.nektwork.MultiMap;
import io.advantageous.reakt.Observer;
import io.advantageous.reakt.Stream;

import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.cert.X509Certificate;


/**
 * This interface was heavily influenced by Vert.x
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface ServerWebSocket extends WebSocket {



    @Override
    ServerWebSocket setTextMessageObserver(Observer<String> bufferStream);
    @Override
    ServerWebSocket setMessageTextStream(Stream<String> bufferStream);
    @Override
    ServerWebSocket setMessageObserver(Observer<Buffer> bufferStream);
    @Override
    ServerWebSocket setMessageStream(Stream<Buffer> bufferStream);
    @Override
    ServerWebSocket setFrameStream(Stream<WebSocketFrame> frameStream);
    @Override
    ServerWebSocket setFrameObserver(Observer<WebSocketFrame> bufferStream);


    @Override
    ServerWebSocket pause();
    @Override
    ServerWebSocket resume();
    @Override
    ServerWebSocket write(Buffer data);
    @Override
    ServerWebSocket write(String data);
    @Override
    ServerWebSocket setWriteQueueMaxSize(int maxSize);
    @Override
    ServerWebSocket writeFrame(WebSocketFrame frame);
    @Override
    ServerWebSocket writeFinalTextFrame(String text);
    @Override
    ServerWebSocket writeFinalBinaryFrame(Buffer data);
    @Override
    ServerWebSocket writeBinaryMessage(Buffer data);
    @Override
    ServerWebSocket closeHandler(Runnable handler);
    String getUri();
    String getPath();
    String getQuery();
    MultiMap<String, String> getHeaders();
    void reject();
    X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException;
}

