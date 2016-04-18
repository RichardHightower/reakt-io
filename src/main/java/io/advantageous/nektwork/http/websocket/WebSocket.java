package io.advantageous.nektwork.http.websocket;


import io.advantageous.nektwork.Buffer;
import io.advantageous.reakt.Observer;
import io.advantageous.reakt.Stream;

import java.net.SocketAddress;


/**
 * This interface was heavily influenced by Vert.x
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface WebSocket  {


    WebSocket setTextMessageObserver(Observer<String> bufferStream);
    WebSocket setMessageTextStream(Stream<String> bufferStream);
    WebSocket setMessageObserver(Observer<Buffer> observer);
    WebSocket setMessageStream(Stream<Buffer> stream);
    WebSocket setFrameStream(Stream<WebSocketFrame> stream);
    WebSocket setFrameObserver(Observer<WebSocketFrame> observer);


    WebSocket pause();
    WebSocket resume();
    WebSocket write(Buffer data);
    WebSocket write(String text);


    WebSocket setWriteQueueMaxSize(int maxSize);
    WebSocket writeFrame(WebSocketFrame frame);
    WebSocket writeFinalTextFrame(String text);
    WebSocket writeFinalBinaryFrame(Buffer data);
    WebSocket writeBinaryMessage(Buffer data);
    WebSocket closeHandler(Runnable handler);
    void close();
    SocketAddress getRemoteAddress();
    SocketAddress getLocalAddress();

}
