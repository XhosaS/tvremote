package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uet {
    static final uet a;
    static final uet b;
    final boolean c;
    final Throwable d;

    static {
        if (ufj.f) {
            b = null;
            a = null;
        } else {
            b = new uet(false, null);
            a = new uet(true, null);
        }
    }

    public uet(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
