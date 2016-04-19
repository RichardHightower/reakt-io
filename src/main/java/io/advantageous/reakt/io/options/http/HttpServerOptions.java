package io.advantageous.reakt.io.options.http;

import io.advantageous.reakt.io.Buffer;
import io.advantageous.reakt.io.options.ClientAuth;
import io.advantageous.reakt.io.options.KeyCertOptions;
import io.advantageous.reakt.io.options.NetServerOptions;
import io.advantageous.reakt.io.options.TrustOptions;

import java.util.ArrayList;
import java.util.Set;

public class HttpServerOptions extends NetServerOptions {


    public static final int DEFAULT_PORT = 8080;
    public static final boolean DEFAULT_COMPRESSION_SUPPORTED = false;
    public static final int DEFAULT_MAX_WEBSOCKET_FRAME_SIZE = 65536;
    public static final int DEFAULT_MAX_CHUNK_SIZE = 8192;
    public static final int DEFAULT_MAX_INITIAL_LINE_LENGTH = 4096;
    public static final int DEFAULT_MAX_HEADER_SIZE = 8192;
    public static final boolean DEFAULT_HANDLE_100_CONTINE_AUTOMATICALLY = false;

    private boolean compressionSupported;
    private int maxWebsocketFrameSize;
    private String websocketSubProtocols;
    private boolean handle100ContinueAutomatically;
    private int maxChunkSize;
    private int maxInitialLineLength;
    private int maxHeaderSize;

    public HttpServerOptions() {
        super();
        compressionSupported = DEFAULT_COMPRESSION_SUPPORTED;
        maxWebsocketFrameSize = DEFAULT_MAX_WEBSOCKET_FRAME_SIZE;
        handle100ContinueAutomatically = DEFAULT_HANDLE_100_CONTINE_AUTOMATICALLY;
        maxChunkSize = DEFAULT_MAX_CHUNK_SIZE;
        maxInitialLineLength = DEFAULT_MAX_INITIAL_LINE_LENGTH;
        maxHeaderSize = DEFAULT_MAX_HEADER_SIZE;
        setPort(DEFAULT_PORT); // We override the default for port
    }

    public HttpServerOptions(HttpServerOptions other) {
        super(other);
        this.compressionSupported = other.compressionSupported;
        this.maxWebsocketFrameSize = other.maxWebsocketFrameSize;
        this.websocketSubProtocols = other.websocketSubProtocols;
        this.handle100ContinueAutomatically = other.handle100ContinueAutomatically;
        this.maxChunkSize = other.maxChunkSize;
        this.maxInitialLineLength = other.maxInitialLineLength;
        this.maxHeaderSize = other.maxHeaderSize;
    }

    public boolean isCompressionSupported() {
        return compressionSupported;
    }

    public HttpServerOptions setCompressionSupported(boolean compressionSupported) {
        this.compressionSupported = compressionSupported;
        return this;
    }

    public int getMaxWebsocketFrameSize() {
        return maxWebsocketFrameSize;
    }

    public HttpServerOptions setMaxWebsocketFrameSize(int maxWebsocketFrameSize) {
        this.maxWebsocketFrameSize = maxWebsocketFrameSize;
        return this;
    }

    public String getWebsocketSubProtocols() {
        return websocketSubProtocols;
    }

    public HttpServerOptions setWebsocketSubProtocols(String websocketSubProtocols) {
        this.websocketSubProtocols = websocketSubProtocols;
        return this;
    }

    public boolean isHandle100ContinueAutomatically() {
        return handle100ContinueAutomatically;
    }

    public HttpServerOptions setHandle100ContinueAutomatically(boolean handle100ContinueAutomatically) {
        this.handle100ContinueAutomatically = handle100ContinueAutomatically;
        return this;
    }

    public int getMaxChunkSize() {
        return maxChunkSize;
    }

    public HttpServerOptions setMaxChunkSize(int maxChunkSize) {
        this.maxChunkSize = maxChunkSize;
        return this;
    }

    public int getMaxInitialLineLength() {
        return maxInitialLineLength;
    }

    public HttpServerOptions setMaxInitialLineLength(int maxInitialLineLength) {
        this.maxInitialLineLength = maxInitialLineLength;
        return this;
    }

    public int getMaxHeaderSize() {
        return maxHeaderSize;
    }

    public HttpServerOptions setMaxHeaderSize(int maxHeaderSize) {
        this.maxHeaderSize = maxHeaderSize;
        return this;
    }

    @Override
    public NetServerOptions setPort(int port) {
        return super.setPort(port);
    }

    @Override
    public int getPort() {
        return super.getPort();
    }

    @Override
    public String getHost() {
        return super.getHost();
    }

    @Override
    public NetServerOptions setHost(String host) {
        return super.setHost(host);
    }

    @Override
    public int getAcceptBacklog() {
        return super.getAcceptBacklog();
    }

    @Override
    public NetServerOptions setAcceptBacklog(int acceptBacklog) {
        return super.setAcceptBacklog(acceptBacklog);
    }

    @Override
    public ClientAuth getClientAuth() {
        return super.getClientAuth();
    }

    @Override
    public NetServerOptions setClientAuth(ClientAuth clientAuth) {
        return super.setClientAuth(clientAuth);
    }

    @Override
    public boolean isTcpNoDelay() {
        return super.isTcpNoDelay();
    }

    @Override
    public NetServerOptions setTcpNoDelay(boolean tcpNoDelay) {
        return super.setTcpNoDelay(tcpNoDelay);
    }

    @Override
    public boolean isTcpKeepAlive() {
        return super.isTcpKeepAlive();
    }

    @Override
    public NetServerOptions setTcpKeepAlive(boolean tcpKeepAlive) {
        return super.setTcpKeepAlive(tcpKeepAlive);
    }

    @Override
    public int getSoLinger() {
        return super.getSoLinger();
    }

    @Override
    public NetServerOptions setSoLinger(int soLinger) {
        return super.setSoLinger(soLinger);
    }

    @Override
    public boolean isUsePooledBuffers() {
        return super.isUsePooledBuffers();
    }

    @Override
    public NetServerOptions setUsePooledBuffers(boolean usePooledBuffers) {
        return super.setUsePooledBuffers(usePooledBuffers);
    }

    @Override
    public int getIdleTimeout() {
        return super.getIdleTimeout();
    }

    @Override
    public NetServerOptions setIdleTimeout(int idleTimeout) {
        return super.setIdleTimeout(idleTimeout);
    }

    @Override
    public boolean isSsl() {
        return super.isSsl();
    }

    @Override
    public NetServerOptions setSsl(boolean ssl) {
        return super.setSsl(ssl);
    }

    @Override
    public KeyCertOptions getKeyCertOptions() {
        return super.getKeyCertOptions();
    }

    @Override
    public NetServerOptions setKeyCertOptions(KeyCertOptions keyCertOptions) {
        return super.setKeyCertOptions(keyCertOptions);
    }

    @Override
    public TrustOptions getTrustOptions() {
        return super.getTrustOptions();
    }

    @Override
    public NetServerOptions setTrustOptions(TrustOptions trustOptions) {
        return super.setTrustOptions(trustOptions);
    }

    @Override
    public Set<String> getEnabledCipherSuites() {
        return super.getEnabledCipherSuites();
    }

    @Override
    public NetServerOptions setEnabledCipherSuites(Set<String> enabledCipherSuites) {
        return super.setEnabledCipherSuites(enabledCipherSuites);
    }

    @Override
    public ArrayList<String> getCrlPaths() {
        return super.getCrlPaths();
    }

    @Override
    public NetServerOptions setCrlPaths(ArrayList<String> crlPaths) {
        return super.setCrlPaths(crlPaths);
    }

    @Override
    public ArrayList<Buffer> getCrlValues() {
        return super.getCrlValues();
    }

    @Override
    public NetServerOptions setCrlValues(ArrayList<Buffer> crlValues) {
        return super.setCrlValues(crlValues);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        HttpServerOptions that = (HttpServerOptions) o;

        if (compressionSupported != that.compressionSupported) return false;
        if (maxWebsocketFrameSize != that.maxWebsocketFrameSize) return false;
        if (handle100ContinueAutomatically != that.handle100ContinueAutomatically) return false;
        if (maxChunkSize != that.maxChunkSize) return false;
        if (maxInitialLineLength != that.maxInitialLineLength) return false;
        if (maxHeaderSize != that.maxHeaderSize) return false;
        return websocketSubProtocols.equals(that.websocketSubProtocols);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (compressionSupported ? 1 : 0);
        result = 31 * result + maxWebsocketFrameSize;
        result = 31 * result + websocketSubProtocols.hashCode();
        result = 31 * result + (handle100ContinueAutomatically ? 1 : 0);
        result = 31 * result + maxChunkSize;
        result = 31 * result + maxInitialLineLength;
        result = 31 * result + maxHeaderSize;
        return result;
    }
}
