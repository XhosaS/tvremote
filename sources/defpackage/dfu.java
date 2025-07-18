package defpackage;

import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfu extends CRLException {
    private final Throwable a;

    public dfu(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public dfu(Throwable th) {
        this.a = th;
    }
}
