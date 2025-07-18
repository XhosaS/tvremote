package defpackage;

import java.security.cert.CertificateEncodingException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zph extends CertificateEncodingException {
    private final Throwable a;

    public zph(Throwable th) {
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
