package defpackage;

import java.security.cert.CertificateException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfk extends CertificateException {
    private final Throwable a;

    public dfk(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
