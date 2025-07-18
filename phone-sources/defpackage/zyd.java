package defpackage;

import java.security.cert.CertificateEncodingException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zyd extends CertificateEncodingException {
    final Throwable a;

    public zyd(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
