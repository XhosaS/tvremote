package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bug {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ bvc b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ bug(Runnable runnable, bvc bvcVar, Runnable runnable2) {
        this.a = runnable;
        this.b = bvcVar;
        this.c = runnable2;
    }

    public final void a() {
        Runnable runnable = this.a;
        if (runnable != null) {
            ay.f(((au) runnable).a);
            return;
        }
        Runnable runnable2 = this.c;
        this.b.n();
        runnable2.run();
    }
}
