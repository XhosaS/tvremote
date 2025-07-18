package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahel {
    public static final ahel a = new ahel();
    public static final ThreadLocal b = new ThreadLocal();

    private ahel() {
    }

    public final ahcr a() {
        ThreadLocal threadLocal = b;
        ahcr ahcrVar = (ahcr) threadLocal.get();
        if (ahcrVar != null) {
            return ahcrVar;
        }
        ahaj ahajVar = new ahaj(Thread.currentThread());
        threadLocal.set(ahajVar);
        return ahajVar;
    }
}
