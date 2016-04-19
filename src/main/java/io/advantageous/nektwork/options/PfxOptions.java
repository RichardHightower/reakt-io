package io.advantageous.nektwork.options;

import io.advantageous.nektwork.Buffer;

public class PfxOptions implements KeyCertOptions, TrustOptions {


    private String password;
    private String path;
    private Buffer value;

    public PfxOptions() {
    }

    public PfxOptions(PfxOptions other) {
        this.password = other.getPassword();
        this.path = other.getPath();
        this.value = other.getValue();
    }

    public String getPassword() {
        return password;
    }

    public PfxOptions setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPath() {
        return path;
    }

    public PfxOptions setPath(String path) {
        this.path = path;
        return this;
    }

    public Buffer getValue() {
        return value;
    }

    public PfxOptions setValue(Buffer value) {
        this.value = value;
        return this;
    }

    @Override
    public PfxOptions clone() {
        return new PfxOptions(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PfxOptions that = (PfxOptions) o;

        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;

    }

    @Override
    public int hashCode() {
        int result = password != null ? password.hashCode() : 0;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
