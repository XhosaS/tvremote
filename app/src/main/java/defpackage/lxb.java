package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxb {
    private static lxa a;

    public static synchronized lxa a() {
        if (a == null) {
            b(new lxe());
        }
        return a;
    }

    public static synchronized void b(lxa lxaVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = lxaVar;
    }
}
