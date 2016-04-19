package io.advantageous.nektwork;

import io.advantageous.reakt.Stream;

import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.cert.X509Certificate;
import java.net.SocketAddress;


/**
 * This interface was heavily influenced by Vert.x
 *
 * @author Rick Hightower
 */
public interface NetSocket {

    NetSocket setBufferStream(Stream<Buffer> bufferStream);

    NetSocket pause();

    NetSocket resume();

    NetSocket close();

    NetSocket write(Buffer data);

    NetSocket write(String string);

    NetSocket write(String string, String encoding);

    X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException;

    NetSocket upgradeToSsl(Runnable upgradeToSSLHandler);

    boolean isSsl();

    SocketAddress getRemoteAddress();

    SocketAddress getLocalAddress();

}


