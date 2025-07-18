package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xe {
    static final xe a;
    static final xe b;
    public final boolean c;
    final Throwable d;

    static {
        if (xn.a) {
            b = null;
            a = null;
        } else {
            b = new xe(false, null);
            a = new xe(true, null);
        }
    }

    public xe(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
