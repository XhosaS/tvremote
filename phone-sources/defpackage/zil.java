package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zil extends IOException {
    private Throwable a;

    public zil(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public zil(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
