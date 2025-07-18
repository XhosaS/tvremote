package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yra {
    public static final ThreadLocal a = new ThreadLocal();

    public static final ypp a() {
        ThreadLocal threadLocal = a;
        ypp yppVar = (ypp) threadLocal.get();
        if (yppVar != null) {
            return yppVar;
        }
        yob yobVar = new yob(Thread.currentThread());
        threadLocal.set(yobVar);
        return yobVar;
    }
}
