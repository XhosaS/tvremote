package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpy implements Runnable {
    final /* synthetic */ affw a;
    final /* synthetic */ afqm b;

    public afpy(afqm afqmVar, affw affwVar) {
        this.a = affwVar;
        this.b = afqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.r(this.a);
    }
}
