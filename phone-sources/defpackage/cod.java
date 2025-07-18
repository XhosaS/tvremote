package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cod {
    static final cod a;
    static final cod b;
    public final boolean c;
    final Throwable d;

    static {
        if (col.a) {
            b = null;
            a = null;
        } else {
            b = new cod(false, null);
            a = new cod(true, null);
        }
    }

    public cod(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
