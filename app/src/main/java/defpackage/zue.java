package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zue {
    static final zue a;
    static final zue b;
    final boolean c;
    final Throwable d;

    static {
        if (zuv.i) {
            b = null;
            a = null;
        } else {
            b = new zue(false, null);
            a = new zue(true, null);
        }
    }

    public zue(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
