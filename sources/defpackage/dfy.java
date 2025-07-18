package defpackage;

import java.security.cert.CertificateEncodingException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfy extends CertificateEncodingException {
    private final Throwable a;

    public dfy(Throwable th) {
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
