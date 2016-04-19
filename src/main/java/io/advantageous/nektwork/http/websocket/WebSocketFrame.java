package io.advantageous.nektwork.http.websocket;


import io.advantageous.nektwork.Buffer;


/**
 * This interface was heavily influenced by Vert.x
 *
 * @author Rick Hightower
 */
@SuppressWarnings("unused")
public interface WebSocketFrame {

    boolean isText();

    boolean isBinary();

    boolean isContinuation();

    String getTextData();

    Buffer getBinaryData();

    boolean isFinal();
}
