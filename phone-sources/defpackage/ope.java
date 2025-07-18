package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ope {
    private static opj a;

    public static synchronized opj a() {
        if (a == null) {
            b(new opj());
        }
        return a;
    }

    public static synchronized void b(opj opjVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = opjVar;
    }
}
