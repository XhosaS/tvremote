package defpackage;

import java.security.cert.CertificateException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zot extends CertificateException {
    private final Throwable a;

    public zot(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
