package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agmo implements Runnable {
    final /* synthetic */ agmp a;
    private final aghg b;
    private final Runnable c;

    public agmo(agmp agmpVar, aghg aghgVar, Runnable runnable) {
        this.a = agmpVar;
        this.b = aghgVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aghd.g(this.b, this.a.d(this.c));
    }
}
