package defpackage;

import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zov extends CRLException {
    final Throwable a;

    public zov(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
