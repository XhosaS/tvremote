package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aguj {
    public static final void a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            agox.a(th, th2);
        }
    }
}
