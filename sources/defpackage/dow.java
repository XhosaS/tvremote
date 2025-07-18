package defpackage;

import java.security.cert.CertificateEncodingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dow extends CertificateEncodingException {
    final Throwable a;

    public dow(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
