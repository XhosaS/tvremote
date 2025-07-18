package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afys implements Runnable {
    private final affi a;
    private final Throwable b;

    public afys(affi affiVar, Throwable th) {
        this.a = affiVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b);
    }
}
