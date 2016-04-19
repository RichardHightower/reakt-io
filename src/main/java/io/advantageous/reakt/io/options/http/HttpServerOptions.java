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
    public HttpServerOptions setPort(int port) {
        super.setPort(port);
        return this;
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
    public HttpServerOptions setHost(String host) {
        super.setHost(host);
        return this;
    }

    @Override
    public int getAcceptBacklog() {
        return super.getAcceptBacklog();
    }

    @Override
    public HttpServerOptions setAcceptBacklog(int acceptBacklog) {
        super.setAcceptBacklog(acceptBacklog);
        return this;
    }

    @Override
    public ClientAuth getClientAuth() {
        return super.getClientAuth();
    }

    @Override
    public HttpServerOptions setClientAuth(ClientAuth clientAuth) {
        super.setClientAuth(clientAuth);
        return this;
    }

    @Override
    public boolean isTcpNoDelay() {
        return super.isTcpNoDelay();
    }

    @Override
    public HttpServerOptions setTcpNoDelay(boolean tcpNoDelay) {
        super.setTcpNoDelay(tcpNoDelay);
        return this;
    }

    @Override
    public boolean isTcpKeepAlive() {
        return super.isTcpKeepAlive();
    }

    @Override
    public HttpServerOptions setTcpKeepAlive(boolean tcpKeepAlive) {
        super.setTcpKeepAlive(tcpKeepAlive);
        return this;
    }

    @Override
    public int getSoLinger() {
        return super.getSoLinger();
    }

    @Override
    public HttpServerOptions setSoLinger(int soLinger) {
        super.setSoLinger(soLinger);
        return this;
    }

    @Override
    public boolean isUsePooledBuffers() {
        return super.isUsePooledBuffers();
    }

    @Override
    public HttpServerOptions setUsePooledBuffers(boolean usePooledBuffers) {
        super.setUsePooledBuffers(usePooledBuffers);
        return this;
    }

    @Override
    public int getIdleTimeout() {
        return super.getIdleTimeout();
    }

    @Override
    public HttpServerOptions setIdleTimeout(int idleTimeout) {
        super.setIdleTimeout(idleTimeout);
        return this;
    }

    @Override
    public boolean isSsl() {
        return super.isSsl();
    }

    @Override
    public HttpServerOptions setSsl(boolean ssl) {
        super.setSsl(ssl);
        return this;
    }

    @Override
    public KeyCertOptions getKeyCertOptions() {
        return super.getKeyCertOptions();
    }

    @Override
    public HttpServerOptions setKeyCertOptions(KeyCertOptions keyCertOptions) {
        super.setKeyCertOptions(keyCertOptions);
        return this;
    }

    @Override
    public TrustOptions getTrustOptions() {
        return super.getTrustOptions();
    }

    @Override
    public HttpServerOptions setTrustOptions(TrustOptions trustOptions) {
        super.setTrustOptions(trustOptions);
        return this;
    }

    @Override
    public Set<String> getEnabledCipherSuites() {
        return super.getEnabledCipherSuites();
    }

    @Override
    public HttpServerOptions setEnabledCipherSuites(Set<String> enabledCipherSuites) {
        setEnabledCipherSuites(enabledCipherSuites);
        return this;
    }

    @Override
    public ArrayList<String> getCrlPaths() {
        return super.getCrlPaths();
    }

    @Override
    public HttpServerOptions setCrlPaths(ArrayList<String> crlPaths) {
        super.setCrlPaths(crlPaths);
        return this;
    }

    @Override
    public ArrayList<Buffer> getCrlValues() {
        return super.getCrlValues();
    }

    @Override
    public HttpServerOptions setCrlValues(ArrayList<Buffer> crlValues) {
        super.setCrlValues(crlValues);
        return this;
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
