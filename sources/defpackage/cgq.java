package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cgq {
    static final cgq a;
    static final cgq b;
    final boolean c;
    final Throwable d;

    static {
        if (chg.f) {
            b = null;
            a = null;
        } else {
            b = new cgq(false, null);
            a = new cgq(true, null);
        }
    }

    public cgq(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
