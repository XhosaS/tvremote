package defpackage;

import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zpd extends CRLException {
    private final Throwable a;

    public zpd(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public zpd(Throwable th) {
        this.a = th;
    }
}
