package io.advantageous.reakt.io.options;


import io.advantageous.reakt.io.Buffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PemTrustOptions implements TrustOptions {

    private ArrayList<String> certificatePaths;
    private ArrayList<Buffer> certificateValues;

    public PemTrustOptions() {

        this.certificatePaths = new ArrayList<>();
        this.certificateValues = new ArrayList<>();
    }

    public PemTrustOptions(PemTrustOptions other) {
        this.certificatePaths = new ArrayList<>(other.getCertificatePaths());
        this.certificateValues = new ArrayList<>(other.getCertificateValues());
    }

    public List<String> getCertificatePaths() {
        return certificatePaths;
    }

    public PemTrustOptions addCertPath(String certificatePath) throws NullPointerException {
        Objects.requireNonNull(certificatePath, "certificatePath can't be null");
        if (certificatePath.isEmpty()) throw new IllegalArgumentException("certPath can't be empty");
        certificatePaths.add(certificatePath);
        return this;
    }

    public List<Buffer> getCertificateValues() {
        return certificateValues;
    }

    public PemTrustOptions addCertificateValue(Buffer certificateValue) throws NullPointerException {
        Objects.requireNonNull(certificateValue, "certificate value cam't be null.");
        certificateValues.add(certificateValue);
        return this;
    }

    @Override
    public PemTrustOptions clone() {
        return new PemTrustOptions(this);
    }

}
