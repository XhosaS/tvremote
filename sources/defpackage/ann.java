package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ann {
    private static anq a;

    public static synchronized anq a() {
        if (a == null) {
            b(new anq());
        }
        return a;
    }

    public static synchronized void b(anq anqVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = anqVar;
    }
}
