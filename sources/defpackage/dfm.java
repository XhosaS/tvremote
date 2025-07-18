package defpackage;

import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfm extends CRLException {
    final Throwable a;

    public dfm(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
