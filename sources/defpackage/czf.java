package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czf extends IOException {
    private Throwable a;

    public czf(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public czf(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
