package defpackage;

import java.security.cert.CertificateEncodingException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zpg extends zpf {
    private final byte[] g;
    private final CertificateEncodingException h;

    public zpg(zyt zytVar, zmj zmjVar, zmf zmfVar, boolean[] zArr, String str, byte[] bArr, byte[] bArr2, CertificateEncodingException certificateEncodingException) {
        super(zytVar, zmjVar, zmfVar, zArr, str, bArr);
        this.g = bArr2;
        this.h = certificateEncodingException;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        CertificateEncodingException certificateEncodingException = this.h;
        if (certificateEncodingException != null) {
            throw certificateEncodingException;
        }
        byte[] bArr = this.g;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException();
    }
}
