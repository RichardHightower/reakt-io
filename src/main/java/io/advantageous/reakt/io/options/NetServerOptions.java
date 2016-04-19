package io.advantageous.reakt.io.options;

import io.advantageous.reakt.io.Buffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NetServerOptions implements Cloneable {

    public static final int DEFAULT_PORT = 0;
    public static final String DEFAULT_HOST = "0.0.0.0";
    public static final int DEFAULT_ACCEPT_BACKLOG = -1;
    public static final boolean DEFAULT_TCP_NO_DELAY = true;
    public static final boolean DEFAULT_TCP_KEEP_ALIVE = false;
    public static final int DEFAULT_SO_LINGER = -1;
    public static final boolean DEFAULT_USE_POOLED_BUFFERS = false;
    public static final boolean DEFAULT_SSL = false;
    public static final int DEFAULT_IDLE_TIMEOUT = 0;
    public static final ClientAuth DEFAULT_CLIENT_AUTH = ClientAuth.NONE;
    public static final int DEFAULT_SEND_BUFFER_SIZE = -1;
    public static final int DEFAULT_RECEIVE_BUFFER_SIZE = -1;
    public static final int DEFAULT_TRAFFIC_CLASS = -1;
    public static final boolean DEFAULT_REUSE_ADDRESS = true;


    private int port;
    private String host;
    private int acceptBacklog;
    private ClientAuth clientAuth = DEFAULT_CLIENT_AUTH;

    private boolean tcpNoDelay;
    private boolean tcpKeepAlive;
    private int soLinger;
    private boolean usePooledBuffers;
    private int idleTimeout;
    private boolean ssl;
    private KeyCertOptions keyCertOptions;
    private TrustOptions trustOptions;
    private Set<String> enabledCipherSuites = new HashSet<>();
    private ArrayList<String> crlPaths;
    private ArrayList<Buffer> crlValues;

    private int sendBufferSize;
    private int receiveBufferSize;
    private int trafficClass;
    private boolean reuseAddress;

    public NetServerOptions() {
        this.port = DEFAULT_PORT;
        this.host = DEFAULT_HOST;
        this.acceptBacklog = DEFAULT_ACCEPT_BACKLOG;
        this.clientAuth = DEFAULT_CLIENT_AUTH;
        this.tcpNoDelay = DEFAULT_TCP_NO_DELAY;
        this.tcpKeepAlive = DEFAULT_TCP_KEEP_ALIVE;
        this.soLinger = DEFAULT_SO_LINGER;
        this.usePooledBuffers = DEFAULT_USE_POOLED_BUFFERS;
        this.idleTimeout = DEFAULT_IDLE_TIMEOUT;
        this.ssl = DEFAULT_SSL;
        this.sendBufferSize = DEFAULT_SEND_BUFFER_SIZE;
        this.receiveBufferSize = DEFAULT_RECEIVE_BUFFER_SIZE;
        this.trafficClass = DEFAULT_TRAFFIC_CLASS;
        this.reuseAddress = DEFAULT_REUSE_ADDRESS;
    }

    public NetServerOptions(NetServerOptions other) {
        this.port = other.port;
        this.host = other.host;
        this.acceptBacklog = other.acceptBacklog;
        this.clientAuth = other.clientAuth;
        this.tcpNoDelay = other.tcpNoDelay;
        this.tcpKeepAlive = other.tcpKeepAlive;
        this.soLinger = other.soLinger;
        this.usePooledBuffers = other.usePooledBuffers;
        this.idleTimeout = other.idleTimeout;
        this.ssl = other.ssl;
        this.keyCertOptions = other.keyCertOptions;
        this.trustOptions = other.trustOptions;
        this.enabledCipherSuites = other.enabledCipherSuites;
        this.crlPaths = other.crlPaths;
        this.crlValues = other.crlValues;
        this.sendBufferSize = other.sendBufferSize;
        this.receiveBufferSize = other.receiveBufferSize;
        this.trafficClass = other.trafficClass;
        this.reuseAddress = other.reuseAddress;
    }

    public int getPort() {
        return port;
    }

    public NetServerOptions setPort(int port) {
        if (port < 0 || port > 65535) throw new IllegalArgumentException("Port out of range");

        this.port = port;
        return this;
    }

    public String getHost() {
        return host;
    }

    public NetServerOptions setHost(String host) {
        this.host = host;
        return this;
    }

    public int getAcceptBacklog() {
        return acceptBacklog;
    }

    public NetServerOptions setAcceptBacklog(int acceptBacklog) {
        this.acceptBacklog = acceptBacklog;
        return this;
    }

    public ClientAuth getClientAuth() {
        return clientAuth;
    }

    public NetServerOptions setClientAuth(ClientAuth clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }

    public boolean isTcpNoDelay() {
        return tcpNoDelay;
    }

    public NetServerOptions setTcpNoDelay(boolean tcpNoDelay) {
        this.tcpNoDelay = tcpNoDelay;
        return this;
    }

    public boolean isTcpKeepAlive() {
        return tcpKeepAlive;
    }

    public NetServerOptions setTcpKeepAlive(boolean tcpKeepAlive) {
        this.tcpKeepAlive = tcpKeepAlive;
        return this;
    }

    public int getSoLinger() {
        return soLinger;
    }

    public NetServerOptions setSoLinger(int soLinger) {
        this.soLinger = soLinger;
        return this;
    }

    public boolean isUsePooledBuffers() {
        return usePooledBuffers;
    }

    public NetServerOptions setUsePooledBuffers(boolean usePooledBuffers) {
        this.usePooledBuffers = usePooledBuffers;
        return this;
    }

    public int getIdleTimeout() {
        return idleTimeout;
    }

    public NetServerOptions setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }

    public boolean isSsl() {
        return ssl;
    }

    public NetServerOptions setSsl(boolean ssl) {
        this.ssl = ssl;
        return this;
    }

    public KeyCertOptions getKeyCertOptions() {
        return keyCertOptions;
    }

    public NetServerOptions setKeyCertOptions(KeyCertOptions keyCertOptions) {
        this.keyCertOptions = keyCertOptions;
        return this;
    }

    public TrustOptions getTrustOptions() {
        return trustOptions;
    }

    public NetServerOptions setTrustOptions(TrustOptions trustOptions) {
        this.trustOptions = trustOptions;
        return this;
    }

    public Set<String> getEnabledCipherSuites() {
        return enabledCipherSuites;
    }

    public NetServerOptions setEnabledCipherSuites(Set<String> enabledCipherSuites) {
        this.enabledCipherSuites = enabledCipherSuites;
        return this;
    }

    public ArrayList<String> getCrlPaths() {
        return crlPaths;
    }

    public NetServerOptions setCrlPaths(ArrayList<String> crlPaths) {
        this.crlPaths = crlPaths;
        return this;
    }

    public ArrayList<Buffer> getCrlValues() {
        return crlValues;
    }

    public NetServerOptions setCrlValues(ArrayList<Buffer> crlValues) {
        this.crlValues = crlValues;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetServerOptions that = (NetServerOptions) o;

        if (port != that.port) return false;
        if (acceptBacklog != that.acceptBacklog) return false;
        if (tcpNoDelay != that.tcpNoDelay) return false;
        if (tcpKeepAlive != that.tcpKeepAlive) return false;
        if (soLinger != that.soLinger) return false;
        if (usePooledBuffers != that.usePooledBuffers) return false;
        if (idleTimeout != that.idleTimeout) return false;
        if (ssl != that.ssl) return false;
        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (clientAuth != that.clientAuth) return false;
        if (keyCertOptions != null ? !keyCertOptions.equals(that.keyCertOptions) : that.keyCertOptions != null)
            return false;
        if (trustOptions != null ? !trustOptions.equals(that.trustOptions) : that.trustOptions != null) return false;
        if (enabledCipherSuites != null ? !enabledCipherSuites.equals(that.enabledCipherSuites) : that.enabledCipherSuites != null)
            return false;
        if (crlPaths != null ? !crlPaths.equals(that.crlPaths) : that.crlPaths != null) return false;
        return crlValues != null ? crlValues.equals(that.crlValues) : that.crlValues == null;

    }

    @Override
    public int hashCode() {
        int result = port;
        result = 31 * result + (host != null ? host.hashCode() : 0);
        result = 31 * result + acceptBacklog;
        result = 31 * result + (clientAuth != null ? clientAuth.hashCode() : 0);
        result = 31 * result + (tcpNoDelay ? 1 : 0);
        result = 31 * result + (tcpKeepAlive ? 1 : 0);
        result = 31 * result + soLinger;
        result = 31 * result + (usePooledBuffers ? 1 : 0);
        result = 31 * result + idleTimeout;
        result = 31 * result + (ssl ? 1 : 0);
        result = 31 * result + (keyCertOptions != null ? keyCertOptions.hashCode() : 0);
        result = 31 * result + (trustOptions != null ? trustOptions.hashCode() : 0);
        result = 31 * result + (enabledCipherSuites != null ? enabledCipherSuites.hashCode() : 0);
        result = 31 * result + (crlPaths != null ? crlPaths.hashCode() : 0);
        result = 31 * result + (crlValues != null ? crlValues.hashCode() : 0);
        return result;
    }
}
