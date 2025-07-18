package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtf extends CancellationException {
    public final int a;
    private final String b;

    public dtf(String str, int i) {
        super(str);
        this.b = str;
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "TimeoutCancellationException(" + this.b + ", " + this.a + ')';
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        return this;
    }
}
