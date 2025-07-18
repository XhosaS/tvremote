package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class eia implements Runnable {
    final /* synthetic */ efn a;
    final /* synthetic */ eiz b;

    public eia(eiz eizVar, efn efnVar) {
        this.a = efnVar;
        this.b = eizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eiz.B(this.a, this.b.i);
    }
}
